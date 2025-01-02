# Valhalla: Value-Objekte mit Java

Goldschmiede vom 24. Januar 2025

[Valhalla](https://openjdk.org/projects/valhalla/) 
ist der Name für ein Projekt, das Java um Value-Objekte ergänzt.
Das klingt auf den ersten Blick sehr unspektakulär. Jedoch ermöglicht erst
dieses Feature, dass die JVM moderne Hardware mit mehrstufigen Caches
effizient nutzt und die Performance von C++ erreicht. Die Erweiterung hat
auch weitreichende Auswirkungen auf die Sprache und die APIs: 
Primitive, wie `int` haben damit keine Sonderstellung mehr, sondern sind
nur noch spezielle Ausprägungen von Value-Objekten. Dadurch wird endlich
so etwas, wie `List<int>` möglich.

In dieser Goldschmiede sehen wir uns an, wie das umgesetzt werden soll
und welche Auswirkungen die Änderungen haben werden.