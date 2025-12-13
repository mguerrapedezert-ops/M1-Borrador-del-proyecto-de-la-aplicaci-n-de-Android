Uruguayn’t

## Descripción del proyecto

Uruguayn’t es una aplicación móvil pensada para estudiantes y jóvenes con rutinas cargadas que necesitan ordenar su tiempo de forma realista. La app permite ingresar tareas, materias o actividades personales, y en base a la disponibilidad diaria del usuario genera un plan de estudio/acciones sugerido. La idea es que el usuario no tenga que “adivinar” cuándo estudiar, sino que la app lo ayude a visualizar su semana y aprovechar huecos libres. También busca crear hábitos constantes para evitar el típico estudio de último momento.

## Exposición del problema

En el contexto uruguayo es común postergar tareas por falta de planificación y por la mezcla de estudio, trabajo, deporte y vida social. Esto termina generando estrés, baja productividad y sensación de estar siempre corriendo atrás de las entregas. Muchas apps de organización son demasiado genéricas o exigen mucha carga manual, entonces la gente las abandona rápido. Uruguayn’t apunta a resolver eso con una experiencia simple y con recomendaciones automáticas adaptadas al horario real del usuario, ayudándolo a cumplir sin llegar sobre la hora.

## Plataforma

Aplicación desarrollada para Android, usando Android Studio con Kotlin + XML. Se prioriza compatibilidad con Android 8.0 o superior. Se seguirá una arquitectura tipo MVVM para mantener el código ordenado, fácil de escalar y seguro para futuras mejoras.

## Interfaz de usuario

- Inicio/registro simple: acceso rápido, sin pasos largos.
- Home: resumen del día con tareas pendientes y sugerencias de horario.
- Agregar tareas: formulario corto con título, fecha, duración y prioridad.
- Calendario semanal: vista clara con bloques recomendados.
- Notificaciones: recordatorios para no colgarse.
- Configuración: horarios disponibles, materias y preferencias.

## Interfaz de administrador

El proyecto no incluye panel de administración porque está orientado al uso personal. Si en el futuro se escala a una app institucional, podría agregarse un rol admin para gestionar estadísticas globales y parámetros de recomendación.

## Funcionalidad

- Registro de usuario.
- Creación de tareas/actividades con prioridad.
- Definición de disponibilidad diaria/semanal.
- Generación automática de horarios recomendados.
- Calendario integrado con visualización semanal.
- Recordatorios por notificación.
- Edición/eliminación de tareas.
- Historial de cumplimiento y estadísticas básicas.

## Diseño (wireframes o esquemas)

- Pantallas previstas:
- Inicio
- Home
- Agregar tarea
- Calendario semanal
- Configuración

## Wireframes descriptivos:

- Inicio: logo + botón “Empezar”.
- Home: tarjetas con tareas del día, y debajo sugerencias con horarios.
- Agregar tarea: inputs mínimos para que no dé pereza cargar.
- Calendario: bloques por día/horario con colores por prioridad.
- Configuración: disponibilidad, notificaciones y materias.

## Registro de Cambios (Changelog)

Cambios pasados (Módulos 1–5)
- Definición del concepto Uruguayn’t y su público objetivo.
- Identificación del problema cultural de postergación.
-  Primer listado de funciones principales.
- Estructura inicial del repositorio y README base.

Cambios actuales (Módulo 6)

- Desarrollo completo de todas las secciones exigidas del README.
- Detalle de interfaz, funciones y diseño.
- Inclusión formal del changelog.
- Ajuste del enfoque para entrega en Wiki.

Cambios futuros (Módulos 7–8)

- Subida del código funcional al repositorio.
- Implementación de pantallas reales en Android Studio.
- Integración de notificaciones y calendario.
- Pruebas, correcciones y documentación final.

## 1. Creación del proyecto Android desde cero

Se generó un proyecto completamente nuevo y limpio en Android Studio para evitar errores de Gradle y conflictos de compilación.
Este paso permitió:

Establecer correctamente la estructura app/src/main/...

Configurar dependencias Kotlin + XML

Garantizar compatibilidad con Android 8.0+

Dejar un entorno estable para seguir creciendo en los siguientes módulos

## 2. Implementación de la primera versión funcional de la app

Por primera vez se desarrollaron pantallas reales:

MainActivity

Pantalla de inicio donde el usuario ingresa su nombre.

Punto de entrada para futuras funciones de registro o preferencias.

HomeActivity

Pantalla que recibe los datos enviados desde MainActivity.

Muestra un mensaje personalizado al usuario del tipo:
“Bienvenido a Uruguaynt, Matías”

Base para convertirla en el futuro “resumen del día”.

Este avance marca el inicio del flujo real de la aplicación.

## 3. Comunicación entre pantallas con Intents

Se implementó el primer intercambio de información interna:

putExtra() para enviar datos desde MainActivity

getStringExtra() para recibirlos en HomeActivity

Esto convierte la app en interactiva, permitiendo que el usuario genere contenido dinámico.
Es también el primer paso para, en los módulos siguientes, transmitir tareas, horarios, configuraciones y más.

## 4. Diseño y actualización de los layouts

Se crearon los primeros archivos XML personalizados:

activity_main.xml

activity_home.xml

Ambos contienen componentes listos para ampliarse, como:

Inputs

Botones

TextViews dinámicos

El diseño se mantuvo simple para priorizar funcionalidad, pero sienta las bases para incorporar los wireframes definidos previamente.

## 5. Integración profesional con GitHub

Por primera vez el proyecto Android quedó correctamente versionado:

Configuración de Git dentro de Android Studio

Sincronización con GitHub via token personal

Subida de TODOS los archivos del proyecto (más de 130)

Commit etiquetado correctamente:
“Módulo 5: Actualización del proyecto + README”

Este paso asegura trazabilidad, control de versiones y permitirá avanzar sin perder cambios.

## Resumen del avance

Gracias a estos pasos, Uruguaynt ya no es solo un documento conceptual:
Es un prototipo real, navegable, interactivo y con estructura técnica sólida, listo para expandirse en los módulos 6, 7 y 8 con:

Pantallas adicionales

Lógica de tareas

Notificaciones

Calendario

Persistencia de datos


## Durante esta etapa del proyecto se avanzó desde un borrador conceptual hacia una primera implementación funcional de la aplicación Android, consolidando la estructura base del código y el flujo principal de navegación.

Los principales avances realizados fueron:
Creación del proyecto Android en Android Studio utilizando Kotlin como lenguaje principal y XML para el diseño de interfaces.
Estructuración del proyecto siguiendo buenas prácticas:
Separación entre actividades (Activity) y recursos (layout, values, manifest).
Uso de múltiples pantallas para representar el flujo real de la app.
Implementación del flujo básico de navegación:
Pantalla de inicio (MainActivity).
Pantalla principal (HomeActivity) donde se muestran las tareas.
Pantalla para agregar una tarea (AddTaskActivity) con campos de nombre, fecha y descripción.
Pantalla de calendario (CalendarActivity) que muestra la información de la tarea creada.
Comunicación entre pantallas mediante Intent y Extras, permitiendo:
Pasar los datos de una tarea desde “Agregar tarea” al calendario.
Volver al Home mostrando la última tarea agregada.
Diseño inicial de la interfaz de usuario:
Layouts en ConstraintLayout.
TextViews y Buttons funcionales.
Interfaz simple y clara, pensada para facilitar el uso.
Configuración correcta del AndroidManifest.xml, registrando todas las actividades y definiendo el punto de entrada de la app.
Actualización y ampliación del archivo README, incorporando:
Descripción del proyecto.
Exposición del problema.
Plataforma.
Funcionalidades.
Registro de cambios (changelog).
Uso activo de GitHub:
Subida del proyecto completo al repositorio.
Commits documentando los avances.
Preparación del repositorio para su uso como base del Wiki.

Este avance permite demostrar que el proyecto no es solo una idea, sino una aplicación en desarrollo con estructura y flujo funcional real.

## Trabajo pendiente / Próximos pasos

Si bien el proyecto cuenta con una base sólida, aún quedan aspectos por desarrollar y mejorar en las próximas etapas:

Persistencia de datos:
Guardar las tareas utilizando una base de datos local (Room) o almacenamiento persistente.
Mejora del calendario:
Visualización semanal o mensual.
Mostrar múltiples tareas y no solo la última agregada.
Validaciones de datos:
Controlar campos vacíos o fechas inválidas al agregar tareas.
Notificaciones:
Implementar recordatorios automáticos según la fecha y hora de la tarea.
Diseño visual:
Mejorar colores, tipografías y consistencia visual.
Adaptar la interfaz a distintos tamaños de pantalla.
Arquitectura:
Aplicar de forma más completa el patrón MVVM.
Pruebas:
Testing básico de funcionamiento y corrección de errores.
Documentación:
Ampliar la Wiki con capturas, diagramas y explicación técnica más profunda.
