package compilador;

/* IMPORTS */
import static compilador.EntradaSalida.*;

public class Compilador {

    public static void main(String[] args) {
        String nameArch = leer("Por favor ingrese el nombre del archivo a compilar: ");
//        String nameArch = args[0];
        IndicadorDeErrores indicaErrores = new IndicadorDeErrores();
        AnalizadorLexico aLexico = new AnalizadorLexico(indicaErrores, nameArch + ".PL0");
        GeneradorDeCodigo gCodigo = new GeneradorDeCodigo(nameArch + ".exe", indicaErrores);
        AnalizadorSintactico aSintactico = new AnalizadorSintactico(indicaErrores, aLexico, gCodigo);

        aSintactico.programa();
    }
}

 /* case FOR:
                aLexico.escanear();
                verificarTerminal(IDENTIFICADOR, 212);

                String variableControl = aLexico.getCadena();
                resultadoBusqueda = aSemantico.buscarIdentificador(base + desplazamiento - 1, 0, variableControl);

                if (resultadoBusqueda == -1 || aSemantico.buscarInfo(resultadoBusqueda).getTipo() != VAR) {
                    indicaErrores.mostrarError(502, aLexico.getTerminal(), aLexico.getCadena());
                }
                aLexico.escanear();

                verificarTerminal(ASIGNACION, 213);
                aLexico.escanear();

                expresion(base, desplazamiento);
                gCodigo.cargarPOP();
                gCodigo.cargarByte(MOV_VAR_EAX_OPCODE);
                gCodigo.cargarByte(MOV_VAR_EAX_OPCODE2);
                gCodigo.cargarEntero(aSemantico.buscarInfo(resultadoBusqueda).getValor());

                verificarTerminal(TO, 214);
                aLexico.escanear();

                int posLimiteSuperior = gCodigo.getTopeMemoria();

                expresion(base, desplazamiento);

                // Almacenar el valor de la expresión en la posición de memoria obtenida
                gCodigo.cargarPOP();
                gCodigo.cargarByte(MOV_VAR_EAX_OPCODE);
                gCodigo.cargarByte(MOV_VAR_EAX_OPCODE2);
                gCodigo.cargarEntero(posLimiteSuperior);

                int inicioBucleFor = gCodigo.getTopeMemoria();

                verificarTerminal(DO, 215);
                aLexico.escanear();

                proposicion(base, desplazamiento);

                // Incrementar la variable de control y volver al inicio del bucle
                gCodigo.cargarByte(POP_EAX_OPCODE);
                gCodigo.cargarByte(POP_EBX_OPCODE);
                gCodigo.cargarByte(ADD_OPCODE);
                gCodigo.cargarByte(ADD_OPCODE2);
                gCodigo.cargarByte(MOV_VAR_EAX_OPCODE);
                gCodigo.cargarByte(MOV_VAR_EAX_OPCODE2);
                gCodigo.cargarEntero(aSemantico.buscarInfo(resultadoBusqueda).getValor());

                gCodigo.cargarByte(JMP_OPCODE);
                distancia = inicioBucleFor - gCodigo.getTopeMemoria() - 5;
                gCodigo.cargarEntero(distancia);

                break;*/