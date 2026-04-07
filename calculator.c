#include <stdio.h>

int main() {
    int a, b, choice;

    while (1) {
        printf("\n===== Simple Calculator =====\n");
        printf("1. Addition\n");
        printf("2. Subtraction\n");
        printf("3. Multiplication\n");
        printf("4. Division\n");
        printf("5. Exit\n");
        printf("nice well done bum");

        printf("Enter your choice: ");
        scanf("%d", &choice);

        if (choice == 5) {
            printf("Exiting calculator...\n");
            break;
        }

        printf("Enter two numbers: ");
        scanf("%d %d", &a, &b);

        switch (choice) {
            case 1:
                printf("Result: %d\n", a + b);
                break;
            case 2:
                printf("Result: %d\n", a - b);
                break;
            case 3:
                printf("Result: %d\n", a * b);
                break;
            case 4:
                if (b != 0)
                    printf("Result: %d\n", a / b);
                else
                    printf("Error: Division by zero!\n");
                break;
            default:
                printf("Invalid choice!\n");
        }
    }

    return 0;
}
