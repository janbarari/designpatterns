fun main() {

    val rectangle: GeometricShape = ShapeFactory.getShape(ShapeType.RECTANGLE)
    rectangle.draw()

    val line: GeometricShape = ShapeFactory.getShape(ShapeType.LINE)
    line.draw()

}