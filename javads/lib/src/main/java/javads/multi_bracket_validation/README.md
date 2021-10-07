# Multi-bracket Validation

[Back](../../../../../../../README.md) to Data Structures & Algorithms

## Challenge

- Write a function called validate brackets
- Arguments: string
- Return: boolean
  - representing whether or not the brackets in the string are balanced.

___

There are 3 types of brackets:

- Round Brackets : ()
- Square Brackets : []
- Curly Brackets : {}

### Example
| Input | Output |
| --- | --- |
| `{}` | true |
| `{}(){}` | true |
| `()[[Extra Characters]]` | true |
| `(){}[[]]` | true |
| `{}{Code}[Fellows](())` | true |
| `[({}]`	| false |
| `(](`	| false |
| `{(})` | false |

___

Consider these small examples and why they fail.

| Input |	Output | Why |
| --- | --- | --- |
| { | false | unmatched opening { remaining. |
| ) | false | closing ) arrived without corresponding opening. |
| [ } | false | closing } doesn’t match opening [. |
