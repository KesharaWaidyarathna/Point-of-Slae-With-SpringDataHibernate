package lk.ijse.dep.pos.dao;

import lk.ijse.dep.pos.entity.SuperEntity;
import org.hibernate.Session;

import java.util.List;

public abstract   class CrudDAOImpl <T extends SuperEntity, ID> implements CrudDAO <T, ID> {

    protected Session session;

    @Override
    public void setSession(Session session) {

        this.session=session;
    }

    @Override
    public List<T> findAll() throws Exception {
        return null;
    }

    @Override
    public T find(ID id) throws Exception {
        return null;
    }

    @Override
    public void save(T entity) throws Exception {
        session.save(entity);

    }

    @Override
    public void update(T entity) throws Exception {
        session.merge(entity);

    }

    @Override
    public void delete(ID id) throws Exception {

    }


}
