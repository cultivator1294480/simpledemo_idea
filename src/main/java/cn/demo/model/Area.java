/**
 * Created by chengcheng on 2017/6/2 0002.
 */
package cn.demo.model;

/**
 * Created by Administrator on 2017/3/22.
 */
public class Area {

   private Integer id;

   private Integer     level;
   private  String        name;
   private Integer parentId;
   private  Integer     status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", level=" + level +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", status=" + status +
                '}';
    }
}