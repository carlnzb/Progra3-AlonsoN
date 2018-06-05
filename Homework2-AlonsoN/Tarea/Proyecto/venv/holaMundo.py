# coding=utf-8

#esto es un comentario en Python

list1 = (123, "a", "b", (1,2), "c")

print("Starting...!" + " lol" + " " + str(list1))

a = b = c = 15

x, y, z = "xtreme", True, 123

name1 = "Carlos Nuñez"

print("Numers: " + str(a) + " " + str(b) + " " + str(c))

print("Numbers " + str(x) + " " + str(y) + " " + str(z))

print(name1[0:5])

number = int(input("Ingrese un numero: "))
if number % 2 == 0:
    print("Es un numero par")
elif number % 3:
    print("Es un multiplo de 3")
else:
    print("Tiene otra clasificacion")

number2 = int(input("Ingrese un año: "))
if number2 % 100 == 0:
    print("El año pertenece al siglo:" + str(number2//100))
else:
    print("El año pertenece al siglo: " + str(number2//100 + 1))
