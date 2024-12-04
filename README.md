
# Simulação do Consenso Paxos

## Descrição
Este projeto implementa uma simulação do algoritmo de consenso Paxos, projetado para sistemas distribuídos alcançarem acordo sobre um único valor, mesmo com falhas de nós.

### Principais Características:
- **Proponentes** propõem valores para os aceitadores.
- **Aceitadores** avaliam e decidem aceitar ou rejeitar propostas.
- Falhas e recuperações de nós são simuladas.
- Logs detalhados acompanham o progresso do algoritmo.

---

## Instruções de Configuração

### Requisitos
- **Java Development Kit (JDK)**: Versão 8 ou superior.

### Passos para Execução:
1. Compile o código:
   ```bash
   javac -d bin src/protocolo/*.java src/aplicacao/*.java
   ```

2. Execute o programa principal:
   ```bash
   java -cp bin aplicacao.Main
   ```

3. Execute os testes:
   ```bash
   java -cp bin aplicacao.TestPaxos
   ```

---

## Fases do Algoritmo
1. **Proposta**: Proponentes enviam propostas aos aceitadores.
2. **Promessa**: Aceitadores respondem prometendo aceitar, caso a proposta seja a maior já recebida.
3. **Aceitação**: A proposta é formalmente aceita e registrada.

---

## Falhas Simuladas
- **Falha de Nós**: Nós podem falhar durante a execução.
- **Recuperação**: Nós podem se recuperar e retornar à rede.
- O sistema continua funcionando com os nós disponíveis e gerencia recuperações.

---

## Logs
Os logs mostram:
- Propostas enviadas e aceitas/rejeitadas.
- Falhas e recuperações de nós.

---

## Conclusão
Este projeto demonstra o algoritmo Paxos em um ambiente distribuído simulado, incluindo tolerância a falhas e mecanismos de recuperação.
