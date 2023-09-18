// code here

CSG text = CSG.text("Ella",5)

CSG rotatedText = text.rotz(90)

double distanceyCenter = rotatedText.getCenterY()

println "Center of Word "+distanceyCenter

CSG centeredText = rotatedText.movey(-distanceyCenter)

double width=30
double depth=70
double height=3

println "Width is "+width
println "Height is "+height
println "depth is "+depth

CSG nameTagBase = new Cube(width,depth,height).toCSG()

return [nameTagBase,centeredText]