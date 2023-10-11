package introduccion.project.reactor;

import reactor.core.publisher.Mono;

public class Ejemplo03 {
	public static void main(String[] args) {
		//Un suplier te devuelve un valor sin pasar alguna parametro
		//El mono esta emitiendo un excepcion
		Mono<String> mono= Mono.fromSupplier(()->{
			throw new RuntimeException("Excepcion ocurrida");
		});
		mono.subscribe(
				data->System.out.println(data),
				err->System.out.println(err), //Solo se ejecuta este y no lo demas porque se detiene en la excepcion
				()->System.out.println("Completado")
		);
	}
}
