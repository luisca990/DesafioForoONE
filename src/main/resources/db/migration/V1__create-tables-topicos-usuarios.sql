CREATE TABLE topic (
    id BIGINT IDENTITY(1,1) PRIMARY KEY, -- Genera el ID automáticamente como un incremento
    title NVARCHAR(255) NOT NULL,       -- Usamos NVARCHAR para soporte de Unicode
    message NVARCHAR(MAX) NOT NULL,     -- Usamos NVARCHAR(MAX) para texto largo
    created_at DATETIME DEFAULT GETDATE(), -- Asigna la fecha y hora actual por defecto
    active BIT DEFAULT 1                -- BIT para valores booleanos (1 = TRUE, 0 = FALSE)
);

CREATE TABLE usuarios (
    id BIGINT NOT NULL IDENTITY(1,1), -- Auto incremento para SQL Server
    login NVARCHAR(100) NOT NULL,    -- NVARCHAR para soporte de Unicode
    clave NVARCHAR(300) NOT NULL,    -- NVARCHAR para soporte de Unicode

    PRIMARY KEY (id)                 -- Definición de clave primaria
);