```groovy
def myMethod(a, b) {
  a = a ?: 0 // Assign 0 if a is null
  b = b ?: 0 // Assign 0 if b is null
  return a + b
}

println myMethod(5, null)
println myMethod(null, 5)
println myMethod(null, null)
```