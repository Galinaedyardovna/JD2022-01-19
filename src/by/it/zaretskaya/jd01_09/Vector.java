package by.it.zaretskaya.jd01_09;

class Vector extends by.it.zaretskaya.jd01_09.Var {

 public Vector(double[] value) {
  this.value = value.clone();
 }

 private final double[] value;

 public Vector(String value) {
 this.value=new double[]{};
}

 public double[] getValue() {return value.clone(); }

 @Override
 public by.it.zaretskaya.jd01_09.Var add(by.it.zaretskaya.jd01_09.Var other) {
  double[] localValue = value.clone();
  if(other instanceof by.it.zaretskaya.jd01_09.Scalar scalar){
  for (int i = 0; i < localValue.length; i++) {
   localValue[i] +=scalar.getValue();
  }
  return new Vector (localValue);
 }else if (other instanceof Vector vector ) {
  if (this.value.length == vector.value.length) {
   for (int i = 0; i < localValue.length; i++) {
    localValue[i] += vector.value[i];
   }
   return new Vector(value);
  }
 }
  return super.add(other);
 }

 @Override
public String toString () {
 StringBuilder out = new StringBuilder();
 out.append("{");
 String delimiter="";
 for (double element:value) {
  out.append(delimiter).append(element);
  delimiter=", ";

  }
 out.append("}");
return out.toString();

}
}
