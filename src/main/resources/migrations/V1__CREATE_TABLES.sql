--
-- PostgreSQL database dump
--

-- Dumped from database version 15.1
-- Dumped by pg_dump version 15.1

-- Started on 2024-02-07 13:14:52

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 215 (class 1259 OID 34921)
-- Name: cores; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cores (
    id bigint NOT NULL,
    tipo character varying(255),
    cor character varying(255)
);


ALTER TABLE public.cores OWNER TO postgres;

--
-- TOC entry 214 (class 1259 OID 34920)
-- Name: id_cores_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.id_cores_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.id_cores_seq OWNER TO postgres;

--
-- TOC entry 3324 (class 0 OID 0)
-- Dependencies: 214
-- Name: id_cores_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.id_cores_seq OWNED BY public.cores.id;


--
-- TOC entry 3318 (class 0 OID 34921)
-- Dependencies: 215
-- Data for Name: cores; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cores (id, tipo, cor) FROM stdin;
1	bg_primary_color	#002069
2	bg_secundary_color	#DC143C
3	font_color	#4B0082
\.


--
-- TOC entry 3325 (class 0 OID 0)
-- Dependencies: 214
-- Name: id_cores_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.id_cores_seq', 1, false);


--
-- TOC entry 3174 (class 2606 OID 34927)
-- Name: cores cores_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cores
    ADD CONSTRAINT cores_pkey PRIMARY KEY (id);


-- Completed on 2024-02-07 13:14:52

--
-- PostgreSQL database dump complete
--

