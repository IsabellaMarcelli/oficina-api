alter table consertos add ativo boolean;

-- Registros já existentes passam a ficar "ativos" no momento da migration:
update consertos set ativo = true;
