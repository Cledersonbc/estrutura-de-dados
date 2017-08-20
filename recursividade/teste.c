#include <stdio.h>

int r(int n);

int main() {
	int n = 27;

	printf("Valor: %d\n", r(n));

	return 0;
}

int r(int n) {
	if (n <= 10)
		return n * 2;
	else
		return r(r(n/3));
}
