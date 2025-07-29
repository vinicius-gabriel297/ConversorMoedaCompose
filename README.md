Este é um mini projeto feito em Kotlin usando **Jetpack Compose**, criado com o objetivo de estudar a construção de interfaces declarativas no Android.

---

## ✨ O que esse app faz?

- Permite digitar um valor em **Reais (BRL)**
- Converte automaticamente para o valor correspondente em **Bitcoin (BTC)**
- Interface moderna com Material 3 e Jetpack Compose
- Utiliza `OutlinedTextField`, gerenciamento de estado com `remember` e pré-visualização com `@Preview`

---

## 📸 Preview

<img width="353" height="783" alt="Captura de tela 2025-07-29 043728" src="https://github.com/user-attachments/assets/f4af7adb-9193-473a-8060-a8b78f0edfa7" />

---

## 🧠 O que aprendi nesse projeto

- Como usar `@Composable` para criar interfaces reativas
- Como funciona o `remember` e o `mutableStateOf` para controle de estado
- Como configurar `OutlinedTextField` com ícones e teclado numérico
- Formatação de valores (`String.format("%.8f", valor)`)
- Como organizar elementos com `Column`, `Modifier`, `padding` e `alignment`
- Como trabalhar com `Preview` para ver a interface no Android Studio sem precisar rodar o app

---

## 🚀 Próximos passos

- [ ] Adicionar a cotação do Bitcoin em tempo real via API
- [ ] Permitir conversão reversa (BTC → BRL)
- [ ] Aplicar tema escuro e responsividade
- [ ] Melhorar validação de entrada

---

## 🛠️ Tecnologias usadas

- Kotlin
- Jetpack Compose
- Material 3 (compose.material3)
- Android Studio

---

## 📂 Como rodar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/ConversorMoedaCompose.git
