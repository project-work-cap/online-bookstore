package com.capgemini.onlinebookstore.mapper;

/**
 * This is an interface which is to be implemented by the mapper classes to
 * perform Entity to DTO and DTO to entity conversions.
 * 
 * @author arivazs
 *
 * @param <UserBookStore>    which is the entity class.
 * @param <UserBookStoreDto> which is the DTO class.
 * 
 */
public interface OisMapper<E, D>
{
	/**
	 * Method to be overridden by the UserBookStoreMapper class to map
	 * UserBookStoreDto to UserBookStore entity.
	 * 
	 */
	E copyDtoToEntity(D dto, E entity);

	/**
	 * Method to be overridden by the UserBookStoreMapper class to map UserBookStore
	 * entity to UserBookStoreDto .
	 * 
	 */
	D copyEntityToDto(E entity, D dto);

}
