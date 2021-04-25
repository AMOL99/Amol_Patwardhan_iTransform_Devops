package assignment


String username="Amol"
String password="12345"
String str = username.concat(':').concat(password)
println str
byte[] b = str.getBytes()
println Arrays.toString(b)
String encode
encode = b.encodeBase64()
println encode

decode = encode.decodeBase64().toString()
println decode
