-- public.article definition

-- Drop table

-- DROP TABLE public.article;

CREATE TABLE public.article
(
    id          varchar(50)  NOT NULL,
    articlename varchar(50)  NOT NULL,
    articleurl  varchar(250) NOT NULL,
    articletype varchar(50)  NOT NULL,
    notes       varchar(50)  NULL,
    createat    timestamp    NULL,
    createby    varchar(50)  NULL,
    updateat    timestamp    NULL,
    updateby    varchar(50)  NULL,
    CONSTRAINT article_pk PRIMARY KEY (id)
);

-- public.battle definition

-- Drop table

-- DROP TABLE public.battle;

CREATE TABLE public.battle
(
    id          varchar     NOT NULL,
    recorddate  varchar     NOT NULL,
    battlecount varchar     NOT NULL,
    notes       varchar(50) NULL,
    createat    timestamp   NULL DEFAULT now(),
    createby    varchar(50) NULL,
    updateat    timestamp   NULL DEFAULT now(),
    updateby    varchar(50) NULL,
    CONSTRAINT battle_pk PRIMARY KEY (id)
);


-- public."enumConfig" definition

-- Drop table

-- DROP TABLE public."enumconfig";

CREATE TABLE public."enumconfig"
(
    id           varchar(50) NOT NULL,
    enumtype     varchar(50) NOT NULL,
    enumname     varchar(50) NOT NULL,
    enumvalue    int4        NOT NULL,
    enumlanguage varchar(50) NULL,
    notes        varchar(50) NULL,
    createat     timestamp   NULL,
    createby     varchar(50) NULL,
    updateat     timestamp   NULL,
    updateby     varchar(50) NULL,
    CONSTRAINT enumconfig_pk PRIMARY KEY (id)
);


-- public.gasoline definition

-- Drop table

-- DROP TABLE public.gasoline;

CREATE TABLE public.gasoline
(
    id         varchar(50) NOT NULL,
    recorddate timestamp   NOT NULL,
    amount     numeric(2)  NOT NULL,
    litre      numeric(2)  NOT NULL,
    unitprice  numeric(2)  NOT NULL,
    isfillup   int4        NOT NULL,
    kilometers int4        NOT NULL,
    notes      varchar(50) NULL,
    createat   timestamp   NULL,
    createby   varchar(50) NULL,
    updateat   timestamp   NULL,
    updateby   varchar(50) NULL,
    CONSTRAINT gasoline_pk PRIMARY KEY (id)
);


-- public.log definition

-- Drop table

-- DROP TABLE public.log;

CREATE TABLE public.log
(
    id              varchar(50)  NOT NULL,
    userdisplayname varchar(50)  NULL,
    exceptiontype   varchar(50)  NULL,
    exceptionmsg    varchar(500) NULL,
    notes           varchar(50)  NULL,
    createat        timestamp    NULL,
    createby        varchar(50)  NULL,
    updateat        timestamp    NULL,
    updateby        varchar(50)  NULL,
    CONSTRAINT log_pk PRIMARY KEY (id)
);


-- public."money" definition

-- Drop table

-- DROP TABLE public."money";

CREATE TABLE public."money"
(
    id         varchar(50) NOT NULL,
    amount     numeric(2)  NOT NULL,
    recorddate timestamp   NOT NULL,
    category   int4        NOT NULL,
    notes      varchar(50) NULL,
    createat   timestamp   NULL,
    createby   varchar(50) NULL,
    updateat   timestamp   NULL,
    updateby   varchar(50) NULL,
    CONSTRAINT money_pk PRIMARY KEY (id)
);


-- public."role" definition

-- Drop table

-- DROP TABLE public."role";

CREATE TABLE public."role"
(
    id        varchar(50) NOT NULL,
    rolename  varchar(50) NOT NULL,
    rolevalue int4        NOT NULL,
    notes     varchar(50) NULL,
    createat  timestamp   NULL,
    createby  varchar(50) NULL,
    updateat  timestamp   NULL,
    updateby  varchar(50) NULL,
    CONSTRAINT role_pk PRIMARY KEY (id)
);


-- public.schedule definition

-- Drop table

-- DROP TABLE public.schedule;

CREATE TABLE public.schedule
(
    id                varchar(50) NOT NULL,
    schedulestartdate timestamp   NULL,
    scheduleenddate   timestamp   NULL,
    notes             varchar(50) NULL,
    createat          timestamp   NULL,
    createby          varchar(50) NULL,
    updateat          timestamp   NULL,
    updateby          varchar(50) NULL,
    CONSTRAINT schedule_pk PRIMARY KEY (id)
);


-- public."user" definition

-- Drop table

-- DROP TABLE public."user";

CREATE TABLE public."user"
(
    id              varchar(50)  NOT NULL,
    username        varchar(50)  NULL,
    userdisplayname varchar(50)  NULL,
    "password"      varchar(250) NULL,
    roletype        int4         NULL,
    citycode        varchar(50)  NULL,
    address         varchar(100) NULL,
    email           varchar(50)  NULL,
    phone           varchar(50)  NULL,
    notes           varchar(50)  NULL,
    createat        timestamp    NULL,
    createby        varchar(50)  NULL,
    updateat        timestamp    NULL,
    updateby        varchar(50)  NULL,
    CONSTRAINT user_pk PRIMARY KEY (id)
);