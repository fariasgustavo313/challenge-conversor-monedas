# Conversor de Monedas - Java

Este proyecto es un **Conversor de Monedas** desarrollado en Java como parte del desafío de programación del programa ONE - Oracle Next Education.

Permite consultar tasas de cambio en tiempo real utilizando la API de [ExchangeRate-API](https://www.exchangerate-api.com/), filtrar monedas específicas y realizar conversiones de manera interactiva desde la consola.

---

## Funcionalidades

- Consumo de una API de tasas de cambio en tiempo real.
- Parseo y análisis de datos JSON con la biblioteca Gson.
- Filtro de monedas de interés: ARS, BRL, CLP, COP, USD y BOB.
- Conversión de montos entre monedas seleccionadas.
- Menú interactivo por consola para una mejor experiencia de usuario.

---

## Tecnologías utilizadas

- **Java 17**
- **Maven**
- **HttpClient (Java 11+)**
- **Gson** para manipulación de JSON
- **ExchangeRate-API** para tasas de cambio

---

## ▶Cómo ejecutar el proyecto

1. **Clonar el repositorio:**

```bash
git clone https://github.com/tuusuario/conversor-monedas-java.git

cd conversor-monedas-java
mvn compile
mvn exec:java -Dexec.mainClass="org.example.Main"

```

## Ejemplo de uso:
Monedas disponibles:
ARS - Peso argentino: 0.0012
BRL - Real brasileño: 0.19
CLP - Peso chileno: 0.0011
COP - Peso colombiano: 0.00025
USD - Dólar estadounidense: 1.0
BOB - Boliviano: 0.14

1000 ARS equivale a 190.00 BRL

## Licencia
Este proyecto fue desarrollado con fines educativos y es de uso libre.
Podés modificarlo, distribuirlo y usarlo como base para tus propios desarrollos.

## Autor
Gustavo Farias
