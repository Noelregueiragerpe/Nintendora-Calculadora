# Nintendora

Este es un proyecto de una calculadora simple en Android. Permite realizar operaciones básicas como la suma de dos números decimales, con una interfaz que incluye botones numéricos, un botón para realizar la operación y otro para borrar los valores ingresados.

![image](https://github.com/user-attachments/assets/4e52623e-7085-4c89-ab17-eee549917083)

## Características

- **Interfaz sencilla**: Una interfaz de usuario clara con botones numéricos (0-9) y dos campos de texto donde el usuario puede ingresar números decimales.
- **Operación básica**: Actualmente, la calculadora solo soporta la operación de **suma**.
- **Borrar valores**: Opción para borrar los valores ingresados en los campos de texto.
- **Resaltado de campos**: Al hacer clic en un campo de texto (EditText), este se resalta, facilitando la interacción con el usuario.
![image](https://github.com/user-attachments/assets/4813b0ba-7474-4c40-8ccd-afb18dd40c94)

## Requisitos

- **Android Studio**: Para abrir y compilar el proyecto.
- **SDK de Android**: Compatible con versiones de Android desde la API 21 (Lollipop) en adelante.

## Instalación

1. **Clonar el repositorio**:
   Si no has descargado el proyecto, puedes clonarlo usando Git:
   ```bash
   git clone https://github.com/tu-usuario/calculadora-noel.git
   ```

2. **Abrir el proyecto en Android Studio**:
   Abre Android Studio y selecciona `Open an existing project`. Navega al directorio donde clonaste el repositorio y ábrelo.

3. **Compilar y ejecutar**:
   Con Android Studio, selecciona un emulador o conecta un dispositivo Android a tu computadora, y haz clic en "Run" para compilar y ejecutar la aplicación.

## Uso

### Ingreso de números

- Utiliza los botones numéricos (0-9) para ingresar los números en los campos de texto. Puedes presionar cualquier número y se irá agregando al campo de texto seleccionado.
  
### Realizar la operación

- Después de ingresar los dos números, presiona el botón "**Sumar**" para calcular la suma de los números ingresados. El resultado se mostrará en la parte inferior de la interfaz.

### Borrar valores

- Si deseas borrar los números ingresados en cualquiera de los campos de texto, simplemente presiona el botón "**Borrar**" y el campo de texto seleccionado se vaciará.

## Estructura del proyecto

- **MainActivity.java**: El archivo Java principal que contiene la lógica de la aplicación, incluyendo el manejo de eventos para los botones y los cálculos.
- **activity_main.xml**: El archivo de diseño que contiene la estructura de la interfaz de usuario, con `EditText`, `TextView` y botones.
- **round.xml**: Un recurso de fondo utilizado para los campos de texto resaltados.
- **AndroidManifest.xml**: El archivo de manifiesto que define los componentes esenciales de la aplicación.

## Dependencias

Este proyecto utiliza las siguientes dependencias (en el archivo `build.gradle`):

```gradle
dependencies {
    implementation 'androidx.appcompat:appcompat:1.3.1'
    implementation 'androidx.constraintlayout:constraintlayout:2.0.4'
}
```

Estas dependencias permiten usar componentes modernos como `ConstraintLayout` y `AppCompatActivity`.

## Contribución

Si deseas contribuir a este proyecto, siéntete libre de hacer un fork del repositorio, realizar tus cambios y enviar un pull request.

## Licencia

Este proyecto está licenciado bajo la **Licencia MIT**. Consulta el archivo LICENSE para más detalles.

---

Este README proporciona una descripción clara de la aplicación, cómo configurarla y cómo interactuar con ella. ¡Si tienes algún cambio o detalle adicional que te gustaría incluir, no dudes en modificarlo!
