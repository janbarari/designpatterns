abstract class ShapeFactory {
    companion object {
        fun getShape(type: ShapeType): GeometricShape {
            var shape: GeometricShape? = null
            when(type) {
                ShapeType.TRIANGLE -> {
                    shape = Triangle()
                }
                ShapeType.LINE -> {
                    shape = Line()
                }
                ShapeType.RECTANGLE -> {
                    shape = Rectangle()
                }
            }
            return shape!!
        }
    }
}