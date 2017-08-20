#include <stdio.h>

void exibe(int n);

int main() {
	int n;

	printf("Valor: ");
	scanf("%d", &n);
	exibe(n);

	return 0;
}

void exibe(int n) {
	if (n > 1)
		exibe(n-1);
	printf("%d\n", n);
}
