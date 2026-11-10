practica de listas 
# Práctica: Exportar e Importar Ventas (TXT y JSON)

Programa en Java por consola que gestiona ventas y permite **exportar** e **importar** los datos en formato **TXT** y **JSON** (usando la librería Gson).

## Requisitos

- Java JDK 17 o superior (verifica con `java -version`)
- Visual Studio Code con la extensión **Extension Pack for Java**
- Librería **Gson 2.10.1** (ya incluida en la carpeta `Lib`)

## Estructura del proyecto

```
Practica/
├── .vscode/
│   └── settings.json      # Configuración para reconocer la librería
├── Lib/
│   └── gson-2.10.1.jar    # Librería Gson
├── Exportar.java          # Lógica de exportación (TXT y JSON)
├── Importar.java          # Lógica de importación
├── menu.java              # Clase principal (main)
├── objVenta.java          # Objeto Venta
├── utilidades.java        # Métodos de apoyo
├── validaciones.java      # Validaciones de datos
├── Ventas.txt             # Archivo de datos en texto
└── README.md
```

## Instalación paso a paso



### 1. Agregar la librería Gson

creamos en la raiz una carpeta Lib
y agregamos el `gson-2.10.1.jar`, descárgalo desde:
https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar
y colócalo dentro de `Lib/`.

### 2. Configurar VS Code
cramos una carpeta en la raiz .vscode
creamos el archivo settings.json con este contenido:

//json
{
    "java.project.referencedLibraries": [
        "Lib/**/*.jar"
    ]
}

esperamos 2 minutos y volvemos a ejecutar 