--
-- PostgreSQL database dump
--

-- Dumped from database version 9.2.5
-- Dumped by pg_dump version 9.2.5
-- Started on 2016-11-29 13:49:58

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 2056 (class 1262 OID 16469)
-- Dependencies: 2055
-- Name: DB_SOLIC; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON DATABASE "DB_SOLIC" IS 'Banco de dados do sistema de solicitações de serviços da Audivisa.';


--
-- TOC entry 192 (class 3079 OID 11727)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2059 (class 0 OID 0)
-- Dependencies: 192
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

--
-- TOC entry 206 (class 1255 OID 58012)
-- Name: fn_insere_papeis_usuario(); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fn_insere_papeis_usuario() RETURNS trigger
    LANGUAGE plpgsql
    AS $$begin
  insert into tb_usuario_papel (ps_id, us_id, up_permissao) 
  select ps.ps_id,
  new.us_id,
  false
  from tb_papel_seg ps;
  
  return new;
end;$$;


ALTER FUNCTION public.fn_insere_papeis_usuario() OWNER TO postgres;

--
-- TOC entry 205 (class 1255 OID 57960)
-- Name: fn_insere_permissoes_papel(); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION fn_insere_permissoes_papel() RETURNS trigger
    LANGUAGE plpgsql
    AS $$begin
  insert into tb_permissao_seg (ps_id, os_id, pe_permissao) 
  select new.ps_id,
  o.os_id,
  false
  from tb_objeto_seg o;
  
  return new;
  
end;
  $$;


ALTER FUNCTION public.fn_insere_permissoes_papel() OWNER TO postgres;

--
-- TOC entry 174 (class 1259 OID 16590)
-- Name: sq_tb_cliente; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_tb_cliente
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.sq_tb_cliente OWNER TO postgres;

--
-- TOC entry 175 (class 1259 OID 16593)
-- Name: sq_tb_cliente_contato; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_tb_cliente_contato
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.sq_tb_cliente_contato OWNER TO postgres;

--
-- TOC entry 176 (class 1259 OID 16601)
-- Name: sq_tb_colaborador; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_tb_colaborador
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.sq_tb_colaborador OWNER TO postgres;

--
-- TOC entry 185 (class 1259 OID 49712)
-- Name: sq_tb_objeto_seg; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_tb_objeto_seg
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.sq_tb_objeto_seg OWNER TO postgres;

--
-- TOC entry 188 (class 1259 OID 49738)
-- Name: sq_tb_papel_seg; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_tb_papel_seg
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.sq_tb_papel_seg OWNER TO postgres;

--
-- TOC entry 189 (class 1259 OID 49752)
-- Name: sq_tb_permissao_seg; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_tb_permissao_seg
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.sq_tb_permissao_seg OWNER TO postgres;

--
-- TOC entry 177 (class 1259 OID 16604)
-- Name: sq_tb_prioridade_solic; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_tb_prioridade_solic
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.sq_tb_prioridade_solic OWNER TO postgres;

--
-- TOC entry 178 (class 1259 OID 16607)
-- Name: sq_tb_situacao_solic; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_tb_situacao_solic
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.sq_tb_situacao_solic OWNER TO postgres;

--
-- TOC entry 179 (class 1259 OID 16611)
-- Name: sq_tb_solicitacao; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_tb_solicitacao
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.sq_tb_solicitacao OWNER TO postgres;

--
-- TOC entry 180 (class 1259 OID 16639)
-- Name: sq_tb_usuario; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_tb_usuario
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.sq_tb_usuario OWNER TO postgres;

--
-- TOC entry 191 (class 1259 OID 57988)
-- Name: sq_tb_usuario_papel; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sq_tb_usuario_papel
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.sq_tb_usuario_papel OWNER TO postgres;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 169 (class 1259 OID 16489)
-- Name: tb_cliente; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_cliente (
    cl_id integer DEFAULT nextval('sq_tb_cliente'::regclass) NOT NULL,
    cl_nome_razao_social character varying(100) NOT NULL,
    cl_tipo_pessoa character varying(15) NOT NULL,
    cl_cpf_cnpj character varying(50),
    cl_telefone_principal character varying(20),
    cl_telefone_celular character varying(20),
    cl_email character varying(50),
    cl_site character varying(100),
    cl_cep character varying(9),
    mu_id integer,
    cl_complemento character varying(100),
    cl_endereco character varying(100),
    cl_bairro character varying(30),
    cl_cartorio character varying(30),
    cl_data_nascto date,
    cl_telefone_opcional character varying(20),
    cl_numero character varying(10),
    cl_inscr_municipal character varying(20),
    cl_inscr_estadual character varying(20),
    cl_nire character varying(20)
);


ALTER TABLE public.tb_cliente OWNER TO postgres;

--
-- TOC entry 170 (class 1259 OID 16497)
-- Name: tb_cliente_contato; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_cliente_contato (
    co_id integer DEFAULT nextval('sq_tb_cliente_contato'::regclass) NOT NULL,
    co_nome character varying(100) NOT NULL,
    co_data_nascto date,
    co_vinculo_funcao character varying(50),
    co_telefone_principal character varying(20),
    co_telefone_celular character varying(20),
    co_email character varying(50),
    cl_id integer,
    co_responsavel boolean,
    co_rg character varying(20),
    co_cpf character varying(11),
    co_conjuge character varying(50),
    co_estado_civil character varying(20),
    co_cartorio character varying(20),
    co_cep character varying(9),
    co_complemento character varying(100),
    co_endereco character varying(100),
    co_bairro character varying(30),
    co_numero character varying(10),
    mu_id integer
);


ALTER TABLE public.tb_cliente_contato OWNER TO postgres;

--
-- TOC entry 183 (class 1259 OID 41353)
-- Name: tb_colaborador; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_colaborador (
    cb_id integer DEFAULT nextval('sq_tb_colaborador'::regclass) NOT NULL,
    cb_nome character varying(100) NOT NULL,
    cb_data_nascto date,
    cb_vinculo_funcao character varying(50),
    cb_data_admissao date,
    cb_data_demissao date,
    cb_cpf character varying(15),
    cb_telefone_principal character varying(20),
    cb_telefone_celular character varying(20),
    cb_email character varying(50),
    cb_cep character varying(10),
    mu_id integer NOT NULL,
    cb_complemento character varying(100),
    cb_endereco character varying(100),
    cb_bairro character varying(50),
    cb_numero character varying(10),
    cb_situacao character varying(7),
    cb_foto bytea
);


ALTER TABLE public.tb_colaborador OWNER TO postgres;

--
-- TOC entry 182 (class 1259 OID 16706)
-- Name: tb_estado; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_estado (
    uf_id character varying(2) NOT NULL,
    uf_nome character varying(30)
);


ALTER TABLE public.tb_estado OWNER TO postgres;

--
-- TOC entry 181 (class 1259 OID 16647)
-- Name: tb_municipio; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_municipio (
    mu_id integer NOT NULL,
    mu_nome character varying(50) NOT NULL,
    uf_id character varying(2) NOT NULL
);


ALTER TABLE public.tb_municipio OWNER TO postgres;

--
-- TOC entry 184 (class 1259 OID 49709)
-- Name: tb_objeto_seg; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_objeto_seg (
    os_id integer DEFAULT nextval('sq_tb_objeto_seg'::regclass) NOT NULL,
    os_codigo character varying(30),
    os_descricao character varying(150)
);


ALTER TABLE public.tb_objeto_seg OWNER TO postgres;

--
-- TOC entry 186 (class 1259 OID 49719)
-- Name: tb_papel_seg; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_papel_seg (
    ps_id integer DEFAULT nextval('sq_tb_papel_seg'::regclass) NOT NULL,
    ps_descricao character varying(150) NOT NULL,
    ps_nome character varying(20) NOT NULL
);


ALTER TABLE public.tb_papel_seg OWNER TO postgres;

--
-- TOC entry 187 (class 1259 OID 49724)
-- Name: tb_permissao_seg; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_permissao_seg (
    ps_id integer NOT NULL,
    os_id integer NOT NULL,
    pe_permissao boolean NOT NULL,
    pe_id integer DEFAULT nextval('sq_tb_permissao_seg'::regclass) NOT NULL
);


ALTER TABLE public.tb_permissao_seg OWNER TO postgres;

--
-- TOC entry 173 (class 1259 OID 16560)
-- Name: tb_prioridade_solic; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_prioridade_solic (
    pr_id integer DEFAULT nextval('sq_tb_prioridade_solic'::regclass) NOT NULL,
    pr_descricao character varying(50) NOT NULL,
    pr_nivel integer
);


ALTER TABLE public.tb_prioridade_solic OWNER TO postgres;

--
-- TOC entry 172 (class 1259 OID 16530)
-- Name: tb_situacao_solic; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_situacao_solic (
    si_id integer DEFAULT nextval('sq_tb_situacao_solic'::regclass) NOT NULL,
    si_descricao character varying(50) NOT NULL,
    si_encerrado boolean
);


ALTER TABLE public.tb_situacao_solic OWNER TO postgres;

--
-- TOC entry 168 (class 1259 OID 16481)
-- Name: tb_solicitacao; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_solicitacao (
    so_id integer DEFAULT nextval('sq_tb_solicitacao'::regclass) NOT NULL,
    so_nome_solicitante character varying(100) NOT NULL,
    so_dthr_solicitacao timestamp with time zone NOT NULL,
    cl_id integer NOT NULL,
    pr_id integer NOT NULL,
    so_dthr_atender timestamp without time zone,
    cb_id integer NOT NULL,
    si_id integer NOT NULL,
    so_dthr_atendimento timestamp without time zone,
    so_descricao_solic character varying(1000) NOT NULL,
    so_observacao character varying(1000),
    so_execucao character varying(3)
);


ALTER TABLE public.tb_solicitacao OWNER TO postgres;

--
-- TOC entry 171 (class 1259 OID 16515)
-- Name: tb_usuario; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_usuario (
    us_id integer DEFAULT nextval('sq_tb_usuario'::regclass) NOT NULL,
    us_login character varying(100) NOT NULL,
    us_senha character varying(100) NOT NULL,
    us_data_cadastro date NOT NULL,
    cb_id integer,
    us_situacao character varying(20) NOT NULL,
    us_facebook boolean
);


ALTER TABLE public.tb_usuario OWNER TO postgres;

--
-- TOC entry 190 (class 1259 OID 57973)
-- Name: tb_usuario_papel; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_usuario_papel (
    up_id integer DEFAULT nextval('sq_tb_usuario_papel'::regclass) NOT NULL,
    ps_id integer NOT NULL,
    up_permissao boolean NOT NULL,
    us_id integer NOT NULL
);


ALTER TABLE public.tb_usuario_papel OWNER TO postgres;

--
-- TOC entry 1899 (class 2606 OID 58021)
-- Name: in_cl_nome_uniq; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_cliente
    ADD CONSTRAINT in_cl_nome_uniq UNIQUE (cl_nome_razao_social);


--
-- TOC entry 1905 (class 2606 OID 58017)
-- Name: in_us_login_uniq; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_usuario
    ADD CONSTRAINT in_us_login_uniq UNIQUE (us_login);


--
-- TOC entry 1924 (class 2606 OID 49723)
-- Name: pk_permissao_seg; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_papel_seg
    ADD CONSTRAINT pk_permissao_seg PRIMARY KEY (ps_id);


--
-- TOC entry 1901 (class 2606 OID 16674)
-- Name: pk_tb_cliente; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_cliente
    ADD CONSTRAINT pk_tb_cliente PRIMARY KEY (cl_id);


--
-- TOC entry 1903 (class 2606 OID 16501)
-- Name: pk_tb_cliente_contato; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_cliente_contato
    ADD CONSTRAINT pk_tb_cliente_contato PRIMARY KEY (co_id);


--
-- TOC entry 1917 (class 2606 OID 41361)
-- Name: pk_tb_coloborador; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_colaborador
    ADD CONSTRAINT pk_tb_coloborador PRIMARY KEY (cb_id);


--
-- TOC entry 1915 (class 2606 OID 16710)
-- Name: pk_tb_estado; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_estado
    ADD CONSTRAINT pk_tb_estado PRIMARY KEY (uf_id);


--
-- TOC entry 1913 (class 2606 OID 16651)
-- Name: pk_tb_municipio; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_municipio
    ADD CONSTRAINT pk_tb_municipio PRIMARY KEY (mu_id);


--
-- TOC entry 1921 (class 2606 OID 49716)
-- Name: pk_tb_objeto_seg; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_objeto_seg
    ADD CONSTRAINT pk_tb_objeto_seg PRIMARY KEY (os_id);


--
-- TOC entry 1929 (class 2606 OID 49766)
-- Name: pk_tb_permissao_seg; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_permissao_seg
    ADD CONSTRAINT pk_tb_permissao_seg PRIMARY KEY (pe_id);


--
-- TOC entry 1911 (class 2606 OID 16564)
-- Name: pk_tb_prioridade_solic; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_prioridade_solic
    ADD CONSTRAINT pk_tb_prioridade_solic PRIMARY KEY (pr_id);


--
-- TOC entry 1909 (class 2606 OID 16534)
-- Name: pk_tb_situacao_solic; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_situacao_solic
    ADD CONSTRAINT pk_tb_situacao_solic PRIMARY KEY (si_id);


--
-- TOC entry 1897 (class 2606 OID 16485)
-- Name: pk_tb_solic; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_solicitacao
    ADD CONSTRAINT pk_tb_solic PRIMARY KEY (so_id);


--
-- TOC entry 1907 (class 2606 OID 16519)
-- Name: pk_tb_usuario; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_usuario
    ADD CONSTRAINT pk_tb_usuario PRIMARY KEY (us_id);


--
-- TOC entry 1931 (class 2606 OID 57977)
-- Name: pk_up; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_usuario_papel
    ADD CONSTRAINT pk_up PRIMARY KEY (up_id);


--
-- TOC entry 1918 (class 1259 OID 49718)
-- Name: ix_objeto_seg_codigo; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE UNIQUE INDEX ix_objeto_seg_codigo ON tb_objeto_seg USING btree (os_codigo);


--
-- TOC entry 1925 (class 1259 OID 49737)
-- Name: ix_papel_objeto; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE UNIQUE INDEX ix_papel_objeto ON tb_permissao_seg USING btree (ps_id, os_id);


--
-- TOC entry 1926 (class 1259 OID 57972)
-- Name: ix_permissao_papel_objeto; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE UNIQUE INDEX ix_permissao_papel_objeto ON tb_permissao_seg USING btree (ps_id, os_id);


--
-- TOC entry 1919 (class 1259 OID 49717)
-- Name: ix_pk_objeto_seg; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE UNIQUE INDEX ix_pk_objeto_seg ON tb_objeto_seg USING btree (os_id);


--
-- TOC entry 1922 (class 1259 OID 49741)
-- Name: ix_pk_papel_seg; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE UNIQUE INDEX ix_pk_papel_seg ON tb_papel_seg USING btree (ps_id);


--
-- TOC entry 1927 (class 1259 OID 49767)
-- Name: ix_pk_tb_permissao_seg; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE UNIQUE INDEX ix_pk_tb_permissao_seg ON tb_permissao_seg USING btree (pe_id);


--
-- TOC entry 1944 (class 2620 OID 57961)
-- Name: tri_papel; Type: TRIGGER; Schema: public; Owner: postgres
--

CREATE TRIGGER tri_papel AFTER INSERT ON tb_papel_seg FOR EACH ROW EXECUTE PROCEDURE fn_insere_permissoes_papel();


--
-- TOC entry 1943 (class 2620 OID 58013)
-- Name: tri_usuario_papel; Type: TRIGGER; Schema: public; Owner: postgres
--

CREATE TRIGGER tri_usuario_papel AFTER INSERT ON tb_usuario FOR EACH ROW EXECUTE PROCEDURE fn_insere_papeis_usuario();


--
-- TOC entry 1939 (class 2606 OID 57962)
-- Name: fk_objeto_permissao; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_permissao_seg
    ADD CONSTRAINT fk_objeto_permissao FOREIGN KEY (os_id) REFERENCES tb_objeto_seg(os_id);


--
-- TOC entry 1940 (class 2606 OID 57967)
-- Name: fk_papel_permissao; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_permissao_seg
    ADD CONSTRAINT fk_papel_permissao FOREIGN KEY (ps_id) REFERENCES tb_papel_seg(ps_id);


--
-- TOC entry 1932 (class 2606 OID 49689)
-- Name: fk_tb_cliente; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_solicitacao
    ADD CONSTRAINT fk_tb_cliente FOREIGN KEY (cl_id) REFERENCES tb_cliente(cl_id);


--
-- TOC entry 1936 (class 2606 OID 58035)
-- Name: fk_tb_cliente; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_cliente_contato
    ADD CONSTRAINT fk_tb_cliente FOREIGN KEY (cl_id) REFERENCES tb_cliente(cl_id);


--
-- TOC entry 1937 (class 2606 OID 58050)
-- Name: fk_tb_cliente_contato_municipio; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_cliente_contato
    ADD CONSTRAINT fk_tb_cliente_contato_municipio FOREIGN KEY (mu_id) REFERENCES tb_municipio(mu_id);


--
-- TOC entry 1935 (class 2606 OID 49704)
-- Name: fk_tb_colaborador_solic; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_solicitacao
    ADD CONSTRAINT fk_tb_colaborador_solic FOREIGN KEY (cb_id) REFERENCES tb_colaborador(cb_id);


--
-- TOC entry 1938 (class 2606 OID 16711)
-- Name: fk_tb_estado; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_municipio
    ADD CONSTRAINT fk_tb_estado FOREIGN KEY (uf_id) REFERENCES tb_estado(uf_id);


--
-- TOC entry 1933 (class 2606 OID 49694)
-- Name: fk_tb_prioridade_solic; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_solicitacao
    ADD CONSTRAINT fk_tb_prioridade_solic FOREIGN KEY (pr_id) REFERENCES tb_prioridade_solic(pr_id);


--
-- TOC entry 1934 (class 2606 OID 49699)
-- Name: fk_tb_situacao_solic; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_solicitacao
    ADD CONSTRAINT fk_tb_situacao_solic FOREIGN KEY (si_id) REFERENCES tb_situacao_solic(si_id);


--
-- TOC entry 1941 (class 2606 OID 58002)
-- Name: fk_up_ps_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_usuario_papel
    ADD CONSTRAINT fk_up_ps_id FOREIGN KEY (ps_id) REFERENCES tb_papel_seg(ps_id);


--
-- TOC entry 1942 (class 2606 OID 58007)
-- Name: fk_up_us_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_usuario_papel
    ADD CONSTRAINT fk_up_us_id FOREIGN KEY (us_id) REFERENCES tb_usuario(us_id);


--
-- TOC entry 2058 (class 0 OID 0)
-- Dependencies: 5
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2016-11-29 13:50:07

--
-- PostgreSQL database dump complete
--

