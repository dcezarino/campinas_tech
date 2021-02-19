package aula24.nakedbank.dao;

public interface IDaoRead<T, V> {

	public T get(V id) throws Exception;

}