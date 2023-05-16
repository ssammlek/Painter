# Web-Based Painter

This is a web application that allows users to draw and edit shapes on a canvas. The application was developed using Vue.js and Express.js.

## How to Run the Project

1. Open the Painter folder using an IDE such as IntelliJ IDEA.
2. Run `src\main\java\eg.edu.alexu.csd.oo.p.draw.cs\CsApplication` (Port:8090).
3. Open the Paint folder using an IDE such as Visual Studio Code.
4. Install "axios" (`npm install axios`).
5. Run `src\components\Paint.vue` (`npm run serve`).
6. Open `http://localhost:8080/` in your web browser.

## UML Class Diagram

![image](https://github.com/ssammlek/Painter/assets/51189763/a10fe486-8537-41b3-88f8-51eb8dd58f92)

## Design Pattern
We used the Factory design pattern to generate new shapes depending on the type of the shape.

## Features

The project supports geometric shapes, including:

- Line Segment
- Circle
- Ellipse
- Triangle
- Rectangle
- Square

The application allows the following functionalities on all shapes:

- Draw
- Color
- Resize
- Move
- Copy
- Delete

It also allows users to undo or redo any action performed.

## Design Decision

We have decided to put two toolboxes, one on the left and the other on the right, with a canvas between them that users can draw on. The left toolbox includes the group of shapes, and the border color picker. The right toolbox includes the group of possible operations, the group of tools, and the fill color picker.

## Snapshots of UI & User Guide

### Drawing Shapes

To draw a shape, click on any icon, then go to the canvas and click and drag. If the user clicks on any shape icon, the shape will stay with them until they click on another icon.

### Setting Border and Fill Colors

If the user wants to make a shape that has a border color, they should pick a color from the color picker that lies in the left toolbox before they draw the selected shape. If the user wants to make a shape that is filled with a color, they should pick this color from the color picker that lies in the right toolbox before they draw the selected shape. Every time the user picks a new shape, they must pick a new fill color, but the border color stays the same.

![image](https://github.com/ssammlek/Painter/assets/51189763/a6618052-3ec5-4b70-8115-4cb632ccd6f2)

### Deleting Shapes

To delete a shape, the user must click on the delete icon, then click on the shape they want to delete. The delete operation is permanent, and the user cannot undo it. Every time the user wants to delete a shape, they must go back to the delete icon, then click on it again (You cannot delete many shapes at the same time).

![Before](https://github.com/ssammlek/Painter/assets/51189763/4f2f878b-6ad1-444f-b1c1-aed152cd10eb)
![After](https://github.com/ssammlek/Painter/assets/51189763/eedea362-ff1c-40fa-9160-37cf37594905)

### Copying Shapes

To copy a shape, the user must click on the copy icon, then click on the shape they want to copy. Every time the user wants to copy a shape, they must go back to the copy icon, then click on it again (You cannot copy many shapes at the same time).

![Coppied filled Circle](https://github.com/ssammlek/Painter/assets/51189763/a529e449-1184-4dd4-8f7b-229424d030fd)

### Moving Shapes

To move a shape, the user must click on the move icon, then click on the shape they want to move and drag it. Every time the user wants to move a shape, they must go back to the move icon, then click on it again (You cannot move many shapes at the same time).

![Before moving the copied circle](https://github.com/ssammlek/Painter/assets/51189763/9806bd2a-41cd-4be5-a63d-ac42aefefd0d)
![Moved Circle](https://github.com/ssammlek/Painter/assets/51189763/59de3b56-9984-467c-9067-57e6adc1ad29)


### Resizing Shapes

To resize a shape, the user must click on the resize icon, then click on the shape they want to resize and drag it. Every time the user wants to resize a shape, they must go back to the resize icon, then click on it again (You cannot resize many shapes at the same time).

![Resizing the Elipse](https://github.com/ssammlek/Painter/assets/51189763/232d3ae0-d7b6-41a4-b1f9-cc08ad6c39d0)
