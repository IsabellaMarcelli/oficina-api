create table consertos(

    id bigint not null auto_increment,
    data_entrada varchar(10),
    data_saida varchar(10),

    -- Mecanico (embedded)
    nome varchar(100) not null,
    anos_experiencia int,

    -- Veiculo (embedded)
    marca varchar(100) not null,
    modelo varchar(100) not null,
    ano varchar(4) not null,

    primary key(id)

);
