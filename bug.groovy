```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return 0 // Handle null values
  }
  return a + b
}

println myMethod(5, null)
println myMethod(null, 5)
println myMethod(null, null)
```