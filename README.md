Uruguayn’t

Descripción del proyecto
Uruguayn’t es una aplicación móvil pensada para estudiantes y jóvenes con rutinas cargadas que necesitan ordenar su tiempo de forma realista. La app permite ingresar tareas, materias o actividades personales, y en base a la disponibilidad diaria del usuario genera un plan de estudio/acciones sugerido. La idea es que el usuario no tenga que “adivinar” cuándo estudiar, sino que la app lo ayude a visualizar su semana y aprovechar huecos libres. También busca crear hábitos constantes para evitar el típico estudio de último momento.

Exposición del problema
En el contexto uruguayo es común postergar tareas por falta de planificación y por la mezcla de estudio, trabajo, deporte y vida social. Esto termina generando estrés, baja productividad y sensación de estar siempre corriendo atrás de las entregas. Muchas apps de organización son demasiado genéricas o exigen mucha carga manual, entonces la gente las abandona rápido. Uruguayn’t apunta a resolver eso con una experiencia simple y con recomendaciones automáticas adaptadas al horario real del usuario, ayudándolo a cumplir sin llegar sobre la hora.

Plataforma
Aplicación desarrollada para Android, usando Android Studio con Kotlin + XML. Se prioriza compatibilidad con Android 8.0 o superior. Se seguirá una arquitectura tipo MVVM para mantener el código ordenado, fácil de escalar y seguro para futuras mejoras.

Interfaz de usuario
- Inicio/registro simple: acceso rápido, sin pasos largos.
- Home: resumen del día con tareas pendientes y sugerencias de horario.
- Agregar tareas: formulario corto con título, fecha, duración y prioridad.
- Calendario semanal: vista clara con bloques recomendados.
- Notificaciones: recordatorios para no colgarse.
- Configuración: horarios disponibles, materias y preferencias.

Interfaz de administrador
El proyecto no incluye panel de administración porque está orientado al uso personal. Si en el futuro se escala a una app institucional, podría agregarse un rol admin para gestionar estadísticas globales y parámetros de recomendación.

Funcionalidad
- Registro de usuario.
- Creación de tareas/actividades con prioridad.
- Definición de disponibilidad diaria/semanal.
- Generación automática de horarios recomendados.
- Calendario integrado con visualización semanal.
- Recordatorios por notificación.
- Edición/eliminación de tareas.
- Historial de cumplimiento y estadísticas básicas.

Diseño (wireframes o esquemas)
- Pantallas previstas:
- Inicio
- Home
- Agregar tarea
- Calendario semanal
- Configuración

Wireframes descriptivos:
- Inicio: logo + botón “Empezar”.
- Home: tarjetas con tareas del día, y debajo sugerencias con horarios.
- Agregar tarea: inputs mínimos para que no dé pereza cargar.
- Calendario: bloques por día/horario con colores por prioridad.
- Configuración: disponibilidad, notificaciones y materias.

Registro de Cambios (Changelog)
- Cambios pasados (Módulos 1–5)
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
