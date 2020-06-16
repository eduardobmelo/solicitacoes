package br.com.audivisa.solserv.model.report;

import java.awt.Color;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import ar.com.fdvs.dj.core.DynamicJasperHelper;
import ar.com.fdvs.dj.core.layout.ClassicLayoutManager;
import ar.com.fdvs.dj.domain.DynamicReport;
import ar.com.fdvs.dj.domain.ImageBanner;
import ar.com.fdvs.dj.domain.Style;
import ar.com.fdvs.dj.domain.builders.ColumnBuilder;
import ar.com.fdvs.dj.domain.builders.FastReportBuilder;
import ar.com.fdvs.dj.domain.builders.GroupBuilder;
import ar.com.fdvs.dj.domain.constants.Border;
import ar.com.fdvs.dj.domain.constants.Font;
import ar.com.fdvs.dj.domain.constants.GroupLayout;
import ar.com.fdvs.dj.domain.constants.HorizontalAlign;
import ar.com.fdvs.dj.domain.constants.Transparency;
import ar.com.fdvs.dj.domain.constants.VerticalAlign;
import ar.com.fdvs.dj.domain.entities.DJGroup;
import ar.com.fdvs.dj.domain.entities.columns.AbstractColumn;
import ar.com.fdvs.dj.domain.entities.columns.PropertyColumn;
import br.com.audivisa.solserv.model.util.JPAUtil;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;

public class RelatorioSolicitacaoPorCliente {

	private EntityManager em = new JPAUtil().getEntityManager();
	private DynamicReport dr;
	private String idCliente;
	private String idPrioridade;
	private String idSituacao;
	
	public RelatorioSolicitacaoPorCliente(String idCliente, String idPrioridade, String idSituacao) {
		this.idCliente = idCliente;
		this.idPrioridade = idPrioridade;
		this.idSituacao = idSituacao;
	}

	public byte[] getDynamicJasperReport() {
		byte[] pdf = null;
		String filter = "where";
		
		if (this.idCliente != null) {
			filter += " s.cliente.id = " + this.idCliente.toString();
		}
		
		if (this.idPrioridade != null) {
			if (filter.equals("where")) {
				filter += " s.prioridade = " + this.idPrioridade.toString();
			} else {
				filter += " and s.prioridade.id = " + this.idPrioridade.toString();
			}
		}
		
		if (this.idSituacao != null) {
			if (filter.equals("where")) {
				filter += " s.situacao.id = " + this.idSituacao.toString();
			} else {
				filter += " and s.situacao = " + this.idSituacao.toString();
			}
		}
		
		String query = "SELECT s FROM Solicitacao s " + filter;
		String title = "Solicitações por Cliente";
		
		try {

			@SuppressWarnings("rawtypes")
			List list = em.createQuery(query).getResultList();
			
			buildReport(title);

			JasperPrint jasperPrint = DynamicJasperHelper.generateJasperPrint(dr, new ClassicLayoutManager(),
					list);
			
			pdf = JasperExportManager.exportReportToPdf(jasperPrint);
		} catch (Exception e) {
			System.out.println("Error : " + e);
		}

		return pdf;
	}
	
	private DynamicReport buildReport(String title) throws Exception {
		
		URL r = getClass().getClassLoader().getResource("/images/LogoAudivisa_Full.jpg");
		String path = r.getPath();
		
		path = URLDecoder.decode(path, "UTF-8");
		
		FastReportBuilder drb = new FastReportBuilder();
		GroupBuilder gb1 = new GroupBuilder();
		
  		Style headerStyle1 = new Style();
  		headerStyle1.setBorderTop(Border.PEN_1_POINT());
  		headerStyle1.setBorderBottom(Border.PEN_1_POINT());
  		headerStyle1.setBorderLeft(Border.PEN_1_POINT());
  		headerStyle1.setBorderRight(Border.PEN_1_POINT());
  		headerStyle1.setVerticalAlign(VerticalAlign.MIDDLE);
  		headerStyle1.setBackgroundColor(Color.GRAY);
  		headerStyle1.setTextColor(Color.WHITE);
  		headerStyle1.setTransparency(Transparency.OPAQUE); 
  		
  		Style headerStyle2 = new Style();
  		headerStyle2.setBorderTop(Border.PEN_1_POINT());
  		headerStyle2.setBorderBottom(Border.PEN_1_POINT());
  		headerStyle2.setBorderLeft(Border.PEN_1_POINT());
  		headerStyle2.setBorderRight(Border.PEN_1_POINT());
  		headerStyle2.setVerticalAlign(VerticalAlign.MIDDLE);
  		headerStyle2.setBackgroundColor(Color.GRAY);
  		headerStyle2.setTextColor(Color.WHITE);
  		headerStyle2.setTransparency(Transparency.OPAQUE);
  		headerStyle2.setHorizontalAlign(HorizontalAlign.CENTER);
		
		drb.setLeftMargin(new Integer(25))
		  			.setRightMargin(new Integer(25))
		  			.setTopMargin(new Integer(25))
		  			.setBottomMargin(new Integer(25));
		drb.setTitle(title);
		drb.setPrintColumnNames(false);
		drb.addImageBanner(path, new Integer(100), new Integer(104), ImageBanner.ALIGN_LEFT);
		
		Style styleGroup = new Style();
		Font fontGroup = Font.ARIAL_MEDIUM_BOLD;
		fontGroup.setFontSize(12);
		styleGroup.setFont(fontGroup);
		
		Style styleId = new Style();
		styleId.setBorderTop(Border.PEN_1_POINT());
		styleId.setBorderBottom(Border.PEN_1_POINT());
		styleId.setBorderLeft(Border.PEN_1_POINT());
		styleId.setBorderRight(Border.PEN_1_POINT());
		styleId.setVerticalAlign(VerticalAlign.MIDDLE);
		styleId.setHorizontalAlign(HorizontalAlign.CENTER);
		
		Style styleDescricao = new Style();
		styleDescricao.setBorderTop(Border.PEN_1_POINT());
		styleDescricao.setBorderBottom(Border.PEN_1_POINT());
		styleDescricao.setBorderLeft(Border.PEN_1_POINT());
		styleDescricao.setBorderRight(Border.PEN_1_POINT());
		styleDescricao.setVerticalAlign(VerticalAlign.MIDDLE);
		
		AbstractColumn columnCliente = ColumnBuilder.getNew()
				.setColumnProperty("cliente.nomeRazaoSocial", String.class.getName())	
				.setTitle("Cliente")
				.setStyle(styleGroup)
				.setWidth(210)
				.build();
		
		AbstractColumn columnId = ColumnBuilder.getNew()
				.setColumnProperty("id", Integer.class.getName())	
				.setTitle("#")
				.setWidth(30)
				.setHeaderStyle(headerStyle2)
				.setStyle(styleId)
				.build();
		
		AbstractColumn columnDataSolicitacao = ColumnBuilder.getNew()
				.setColumnProperty("dataHoraSolicitacao", Date.class.getName())	
				.setTitle("Data Solicitação")
				.setWidth(90)
				.setHeaderStyle(headerStyle2)
				.setStyle(styleId)
				.build();
		
		AbstractColumn columnDataAtender = ColumnBuilder.getNew()
				.setColumnProperty("dataHoraAtender", Date.class.getName())	
				.setTitle("Atender até")
				.setWidth(90)
				.setHeaderStyle(headerStyle2)
				.setStyle(styleId)
				.build();
		
		AbstractColumn columnSituacao = ColumnBuilder.getNew()
				.setColumnProperty("situacao.descricao", String.class.getName())	
				.setTitle("Situação")
				.setHeaderStyle(headerStyle2)
				.setStyle(styleId)
				.setWidth(60)
				.build();
		
		AbstractColumn columnExecucao = ColumnBuilder.getNew()
				.setColumnProperty("execucao", String.class.getName())	
				.setTitle("Execução(%)")
				.setWidth(70)
				.setHeaderStyle(headerStyle2)
				.setStyle(styleId)
				.build();
		
		Style styleHeaderSolic = new Style();
		styleHeaderSolic.setHorizontalAlign(HorizontalAlign.LEFT);
		
		AbstractColumn columnSolicitacao = ColumnBuilder.getNew()
				.setColumnProperty("solicitacao", String.class.getName())	
				.setTitle("Descrição da Solicitação")
				.setHeaderStyle(headerStyle1)
				.setStyle(styleDescricao)
				.setWidth(190)
				.build();
		
		
		DJGroup g1 = gb1.setCriteriaColumn((PropertyColumn) columnCliente)
				.setGroupLayout(GroupLayout.VALUE_IN_HEADER_WITH_HEADERS)
				.setHeaderHeight(20)
				.build();
		
		drb.addColumn(columnCliente);
		drb.addColumn(columnId);
		drb.addColumn(columnDataSolicitacao);
		drb.addColumn(columnDataAtender);
		drb.addColumn(columnSituacao);
		drb.addColumn(columnExecucao);
		drb.addColumn(columnSolicitacao);
		drb.addGroup(g1);
		
		dr = drb.build();
		
		return dr;
	}

}
