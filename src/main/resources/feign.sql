CREATE TABLE IF NOT EXISTS tipo_documento (
  id_tipo_documento SERIAL PRIMARY KEY,
  cod_tipo VARCHAR(45) NOT NULL,
  desc_tipo VARCHAR(45) NOT NULL,
  estado INT NOT NULL,
  usua_crea VARCHAR(45),
  date_create TIMESTAMP,
  usua_modif VARCHAR(45),
  date_modif TIMESTAMP,
  usua_delet VARCHAR(45),
  date_delet TIMESTAMP
);

CREATE TABLE IF NOT EXISTS empresa (
  id_empresa SERIAL PRIMARY KEY,
  num_docu VARCHAR(15) NOT NULL,
  razon_social VARCHAR(150) NOT NULL,
  nom_comercial VARCHAR(150) NOT NULL,
  estado INT NOT NULL,
  usua_crea VARCHAR(45),
  date_create TIMESTAMP,
  usua_modif VARCHAR(45),
  date_modif TIMESTAMP,
  usua_delet VARCHAR(45),
  date_delet TIMESTAMP,
  tipo_documento_id INT NOT NULL,
  FOREIGN KEY (tipo_documento_id) REFERENCES tipo_documento (id_tipo_documento) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE IF NOT EXISTS persona (
  id_persona SERIAL PRIMARY KEY,
  num_docu VARCHAR(15) NOT NULL,
  nombres VARCHAR(150) NOT NULL,
  ape_pat VARCHAR(150) NOT NULL,
  ape_mat VARCHAR(150) NOT NULL,
  estado INT NOT NULL,
  usua_crea VARCHAR(45),
  date_create TIMESTAMP,
  usua_modif VARCHAR(45),
  date_modif TIMESTAMP,
  usua_delet VARCHAR(45),
  date_delet TIMESTAMP,
  tipo_documento_id INT NOT NULL,
  FOREIGN KEY (tipo_documento_id) REFERENCES tipo_documento (id_tipo_documento) ON DELETE NO ACTION ON UPDATE NO ACTION
);
