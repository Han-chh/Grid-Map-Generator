# Grid Map Generator

## Description

Grid Map Generator is a lightweight Java application built with Swing for generating customizable grid-based maps.  
Each grid cell is represented by a `MapGrid` object, which extends `JLabel`, allowing flexible rendering and interaction.

In the current version, the program creates a static main window (`Window.Win`) containing two panels:

- `Window.Map_panel`: displays the generated grid map  
- `Window.infoboard`: displays control components and information  

A single button (`Win.start`) is provided to trigger map generation.

---

## Customization

This generator does not provide a graphical input interface, as it is designed to be embedded into other applications or used as a backend component.

### Core Map Generation Method

```java
public static MapGrid[][] generate(
    JPanel mapPanel,
    int rows,
    int columns,
    int cellSizeX,
    int cellSizeY
)
```

Detailed explanations of the parameters and return value can be found in the source code comments.

> If the generated map is not displayed correctly, try resizing the main application window.

---

## Features

- Generate grid maps with customizable dimensions  
- Each tile represented as an independent object  
- Interactive map rendering  
- Swing-based graphical user interface  
- Designed for easy integration into other Java programs  

---

## Requirements

- Java Development Kit (JDK) 8 or higher

---

## Installation and Running

1. Make sure JDK is installed on your system.
2. Navigate to the project root directory.
3. Compile the source files:
   ```bash
   javac -d bin src/MapGenerator/*.java
   ```
4. Run the application:
   ```bash
   java -cp bin MapGenerator.Game
   ```

---

## Usage

1. Launch the application  
2. Click the **Start** button  
3. A new grid map will be generated and displayed in the window  

---

## Project Structure

- `src/MapGenerator/Game.java` – Application entry point  
- `src/MapGenerator/Window.java` – Main window and UI layout  
- `src/MapGenerator/MapGrid.java` – Grid cell component  
- `bin/` – Compiled class files  

---

## Contributing

Contributions, suggestions, and improvements are welcome!
