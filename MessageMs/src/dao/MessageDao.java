package dao;

import entity.MessageBean;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import util.DBCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class MessageDao {
    public List<MessageBean> listAll() throws Exception {
        Connection conn = DBCon.getConnection();
        String sql = "select mid,mcontent,publish from MessageInfo";
        try {
            return new QueryRunner().query(
                    conn, sql, new BeanListHandler<MessageBean>(MessageBean.class));
        } finally {
            DbUtils.closeQuietly(conn);
        }
    }
    public void delete(String id) throws Exception {
        Connection conn = DBCon.getConnection();
        String sql = "delete from MessageInfo where id = ?";
        try {
            new QueryRunner().update(conn, sql, id);
        } finally {
            DbUtils.closeQuietly(conn);
        }
    }
    public void deletes(String[] ids) throws Exception {
        Connection conn = DBCon.getConnection();
        String sql = "delete from MessageInfo where id in ?";
        try {
            new QueryRunner().update(conn, sql, ids);
        } finally {
            DbUtils.closeQuietly(conn);
        }
    }
}
