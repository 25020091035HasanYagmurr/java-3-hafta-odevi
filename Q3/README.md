# Soru 3 - Course

Revize edilmiş Course sınıfı:
- getStudents() yeni dizi döndürür.
- addStudent() kapasite dolunca otomatik büyütür.
- dropStudent() metodu eklenir.
- clear() metodu eklenir.

UML:

+-------------------------+
| Course                  |
+-------------------------+
| - courseName: String    |
| - students: String[]    |
| - numberOfStudents: int |
+-------------------------+
| + Course(courseName:String)
| + getCourseName(): String
| + addStudent(student:String): void
| + dropStudent(student:String): void
| + clear(): void
| + getStudents(): String[]
| + getNumberOfStudents(): int
+-------------------------+

