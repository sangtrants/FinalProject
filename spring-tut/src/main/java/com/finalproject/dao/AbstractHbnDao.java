package com.finalproject.dao;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ReflectionUtils;

public abstract class AbstractHbnDao<T extends Object> implements Dao<T> {
	@Autowired
	private SessionFactory sessionFactory;
	private Class<T> domainClass;
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	private Class<T> getDomainClass(){
		if(domainClass==null){
			ParameterizedType thisType=(ParameterizedType)getClass().getGenericSuperclass();
			this.domainClass=(Class<T>)thisType.getActualTypeArguments()[0];
		}
		return domainClass;
	}
	private String getDomainClassName(){
		return getDomainClass().getName();
	}
	public void create(T t){
		Method method= ReflectionUtils.findMethod(getDomainClass(), "setDateCreated",new Class[]{Date.class});
		if(method!=null){
			try{
				method.invoke(t, new Date());
			} catch(Exception ex){
				
			}
			getSession().save(t);
		}
	}
	@SuppressWarnings("unchecked")
	public T get(Serializable id) {
		return (T) getSession().get(getDomainClass(), id);
	}
	public T load(Serializable id) {
		return (T) getSession().load(getDomainClass(), id);
	}
	public List<T> getAll() {
		return getSession().createQuery("from " + getDomainClassName()).list();
	} 
		
	public void update(T t) {
		getSession().update(t);
	}
	public void delete(T t) {
		getSession().delete(t);
	}
	public void deleteById(Serializable id) {
		delete(load(id));
	}
	public void deleteAll() {
		getSession().createQuery("delete " + getDomainClassName()).executeUpdate();
	} 
	public long count() {
		return (Long) getSession().createQuery("select count(*) from " +getDomainClassName()).uniqueResult();
	}
	public boolean exists(Serializable id) {
		return (get(id) != null);
	}
}
