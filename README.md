# Implementación de una API REST para gestión de productos

El equipo de desarrollo de una plataforma de comercio electrónico necesita una API REST para gestionar productos. La API debe permitir crear, leer, actualizar y eliminar productos. Los productos tienen un nombre, precio, stock y categoría. La API debe validar que los nombres de los productos no se dupliquen y que los precios no sean negativos. Además, debe manejar adecuadamente los errores y proporcionar documentación OpenAPI.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Desarrollo de una API REST con Spring Boot y JPA |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Creación de la estructura básica de la API

**Objetivo:** Implementar la funcionalidad mínima para crear y leer productos.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Diseña la estructura de la API para crear y leer productos.
- Implementa la validación de nombres duplicados y precios negativos.
- Asegúrate de que la API devuelva los productos creados correctamente.

**Entregable:** API REST que permite crear y leer productos con las validaciones necesarias.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo estructurar los endpoints para crear y leer productos.
- Piensa en cómo manejar los errores de validación.

</details>

### Fase 2: Actualización y eliminación de productos

**Objetivo:** Implementar la funcionalidad para actualizar y eliminar productos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Añade endpoints para actualizar y eliminar productos.
- Asegúrate de que la actualización mantenga las validaciones de nombres duplicados y precios negativos.
- Implementa la eliminación de productos de manera segura.

**Entregable:** API REST que permite crear, leer, actualizar y eliminar productos con las validaciones necesarias.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo manejar las validaciones durante la actualización de productos.
- Piensa en cómo asegurar que la eliminación de productos sea segura y no cause inconsistencias.

</details>

### Fase 3: Documentación OpenAPI

**Objetivo:** Proporcionar documentación OpenAPI para la API.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Genera documentación OpenAPI para la API.
- Asegúrate de que la documentación sea clara y describa todas las funcionalidades y validaciones de la API.
- Verifica que la documentación esté actualizada y sea útil para los usuarios de la API.

**Entregable:** API REST con documentación OpenAPI completa y actualizada.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo hacer que la documentación sea clara y útil para los usuarios.
- Piensa en cómo mantener la documentación actualizada con los cambios en la API.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una API REST y cuáles son sus componentes principales?
- **paraQueSirve**: ¿Para qué sirve la validación de nombres duplicados y precios negativos en la API?
- **comoSeUsa**: ¿Cómo se usa la documentación OpenAPI para entender y utilizar la API?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar una API REST y cómo se pueden evitar?

## Criterios de Evaluacion

- Implementación correcta de la funcionalidad para crear, leer, actualizar y eliminar productos.
- Validación adecuada de nombres duplicados y precios negativos.
- Documentación OpenAPI clara y actualizada.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
