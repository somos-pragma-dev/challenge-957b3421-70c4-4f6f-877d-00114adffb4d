# Implementación de una API REST en un sistema de gestión de préstamos

En un sistema de gestión de préstamos bancarios, se requiere implementar una API REST que permita a los clientes consultar el estado de sus préstamos y realizar nuevos préstamos. La API debe integrarse con un motor de evaluación de riesgos y un sistema de contabilidad. Los préstamos tienen atributos como monto, plazo, tasa de interés y estado. La API debe manejar correctamente los errores de validación y garantizar la idempotencia en las solicitudes de préstamo. El sistema procesa un promedio de 1 500 solicitudes por segundo en hora pico.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Java Spring Boot |
| **Nivel** | junior-l1 |
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

### Fase 1: Definición de endpoints y modelo de datos

**Objetivo:** Definir los endpoints necesarios y el modelo de datos para representar los préstamos y sus atributos.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar los endpoints requeridos para consultar y crear préstamos.
- Definir el modelo de datos para los préstamos, incluyendo atributos como monto, plazo, tasa de interés y estado.
- Establecer las relaciones entre los préstamos y otros componentes del sistema.

**Entregable:** Modelo de datos y definición de endpoints para la API REST.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los atributos necesarios para representar un préstamo.
- Piensa en las relaciones que los préstamos tienen con otros componentes del sistema.

</details>

### Fase 2: Implementación de la lógica de negocio

**Objetivo:** Implementar la lógica de negocio para la creación y consulta de préstamos, incluyendo la validación de datos y la integración con el motor de evaluación de riesgos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementar la lógica para crear y consultar préstamos.
- Integrar la API con el motor de evaluación de riesgos para validar las solicitudes de préstamo.
- Manejar los errores de validación y garantizar la idempotencia en las solicitudes de préstamo.

**Entregable:** Lógica de negocio implementada para la creación y consulta de préstamos, con integración al motor de evaluación de riesgos.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los posibles errores de validación y cómo manejarlos.
- Piensa en cómo garantizar la idempotencia en las solicitudes de préstamo.

</details>

### Fase 3: Documentación y pruebas

**Objetivo:** Documentar la API utilizando OpenAPI y realizar pruebas para garantizar su correcto funcionamiento.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Documentar la API utilizando OpenAPI.
- Realizar pruebas unitarias y de integración para garantizar el correcto funcionamiento de la API.
- Verificar que la API maneje correctamente los errores y garantiza la idempotencia en las solicitudes de préstamo.

**Entregable:** API documentada y pruebas unitarias y de integración realizadas.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza OpenAPI para documentar los endpoints y sus parámetros.
- Realiza pruebas para cubrir los casos de uso más comunes y los edge cases identificados.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un préstamo y cuáles son sus atributos esenciales?
- **paraQueSirve**: ¿Para qué sirve la API REST en el contexto del sistema de gestión de préstamos?
- **comoSeUsa**: ¿Cómo se usa la API para crear y consultar préstamos?
- **erroresComunes**: ¿Cuáles son los errores comunes que pueden ocurrir al crear un préstamo y cómo se manejan?
- **queDecisionesImplica**: ¿Qué decisiones implica la integración de la API con el motor de evaluación de riesgos?

## Criterios de Evaluacion

- Definición correcta de endpoints y modelo de datos.
- Implementación de la lógica de negocio para la creación y consulta de préstamos.
- Integración correcta con el motor de evaluación de riesgos.
- Manejo adecuado de errores de validación y garantía de idempotencia.
- Documentación completa utilizando OpenAPI y realización de pruebas unitarias y de integración.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
