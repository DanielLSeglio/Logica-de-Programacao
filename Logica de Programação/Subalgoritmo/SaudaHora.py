# Método 1: função que retorna a saudação
def saudacao(hora):
    if hora < 6:
       return "Boa Madrugada!"
    elif hora < 12:
       return "Bom dia!"
    elif hora < 18:
       return "Boa Tarde!"
    elif hora < 24:
       return "Boa Noite!"
    else:
        return "Horário Indisponível."

hora = int(input("Digite seu horário (Ex 12 para 12 horas): "))
# Exibe a mensagem retornada pela função junto com saudação fixa
print(f"{saudacao(hora)} Seja Bem-Vindo a FIAP!")



# Método 2: função que já imprime a saudação diretamente
def saudacao2(hora):
    if hora < 6:
       msg = "Boa Madrugada!"
    elif hora < 12:
       msg = "Bom dia!"
    elif hora < 18:
       msg = "Boa Tarde!"
    elif hora < 24:
       msg = "Boa Noite!"
    else:
       msg = "Horário Indisponível."

    print(f"{msg} Seja Bem-Vindo a FIAP!!!")
    
# Chama a função que imprime direto
saudacao2(hora)
