#include <stdio.h>

int main() {
    int i, j;
    printf("hello");
    printf("=== Pattern ===\n\n");

    for (i = 1; i <= 5; i++) {
        for (j = 1; j <= i; j++) {
            printf("%d ", j);
        }
        printf("\n");
    }
    printf("hello");

    return 0;
}
