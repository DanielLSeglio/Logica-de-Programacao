# Função que verifica se a nota está no intervalo válido (0 a 10)
def NotaValida(nota):
    if nota >= 0 and nota <= 10:
        return True  # Nota válida
    else:
        return False  # Nota inválida

# Solicita a primeira nota ao usuário
nota1 = float(input("Digite a primeira nota: "))

# Verifica se a primeira nota é válida
if NotaValida(nota1):
    # Se a primeira nota for válida, solicita a segunda nota
    nota2 = float(input("Digite a segunda nota: "))

    # Verifica se a segunda nota também é válida
    if NotaValida(nota2):
        media = (nota1 + nota2) / 2  # Calcula a média das duas notas
        print(f"A média da soma de {nota1} + {nota2} é {media}")
    else:
        # Mensagem caso a segunda nota seja inválida
        print(f"A nota {nota2} é uma Nota Inválida!")

else:
    # Mensagem caso a primeira nota seja inválida
    print(f"A nota {nota1} é uma Nota Inválida!")
