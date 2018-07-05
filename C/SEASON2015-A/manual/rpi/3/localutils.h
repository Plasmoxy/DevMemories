/* header localutils.h
	uses @basic
*/

void empty_array(int array[]) {
	int __i;
	for (__i=0; __i<sizeof(array)/sizeof(int); __i++) {
		array[__i] = 0;
	}
}

void print_array(int array[]) {
	int __i;
	printf("{ ");
	for (__i=0; __i<sizeof(array)/sizeof(int); __i++) {
		printf("%d, ", array[__i]);
	}
	printf("}\n");
}
