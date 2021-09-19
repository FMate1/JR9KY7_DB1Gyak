#include <stdio.h>
#include <stdlib.h>

int main()
{
    FILE *fptr1, *fptr2;
    char filename[100], c;

    printf("Adja meg az elso filenevet olvasashoz: \n");
    scanf("%s", filename);

    // Egy file megnyitása olvasashoz
    fptr1 = fopen(filename, "r");
    if (fptr1 == NULL)
    {
        printf("Nem nyithato meg a file %s \n", filename);
        exit(0);
    }

    printf("Adja meg az elso filenevet irashoz: \n");
    scanf("%s", filename);

    // Meg egy file megnyitasa irashoz
    fptr2 = fopen(filename, "w");
    if (fptr2 == NULL)
    {
        printf("Nem nyithato meg a file %s \n", filename);
        exit(0);
    }

    // Adatok beolvasasa a filebol
    c = fgetc(fptr1);
    while (c != EOF)
    {
        fputc(c, fptr2);
        c = fgetc(fptr1);
    }

    printf("\nAdatok atmasolva: %s", filename);

    fclose(fptr1);
    fclose(fptr2);
    return 0;
}
