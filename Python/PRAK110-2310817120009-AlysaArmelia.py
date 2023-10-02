import math
c = 12
a = 5
b = round (math.sqrt(a*a + c*c))

K = a + b + c
l = round (1 / 2 * a * c)

print("Diketahui : ")
print(f"Alas = {c} cm")
print(f"Tinggi = {a} cm ")
print("Jawab : ")
print(f"Sisi A = {a} cm")
print(f"Sisi B = {b} cm")
print(f"Sisi C = {c} cm")
print(f"Keliling = {K} cm")
print(f"Luas {l} cm")