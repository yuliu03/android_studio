package com.example.retrofit;

import java.io.Serializable;
import java.util.List;

public class Menu {

    /**
     * code : success
     * data : [{"pageNum":0,"pageSize":0,"uuid":"1","menuId":"1","menuName":"菜单类一级","createdBy":null,"updatedTime":null,"updatedBy":null,"createdTime":null,"remark":null,"version":0,"isDel":0,"pid":"0","isLeaf":false,"fileUrl":null,"icon":"el-icon-share","ext":null,"children":[{"pageNum":0,"pageSize":0,"uuid":"11","menuId":"11","menuName":"菜单类二级","createdBy":null,"updatedTime":null,"updatedBy":null,"createdTime":null,"remark":null,"version":0,"isDel":0,"pid":"1","isLeaf":false,"fileUrl":null,"icon":"el-icon-share","ext":null,"children":[{"pageNum":0,"pageSize":0,"uuid":"111","menuId":"111","menuName":"菜单","createdBy":null,"updatedTime":null,"updatedBy":null,"createdTime":null,"remark":null,"version":0,"isDel":0,"pid":"11","isLeaf":true,"fileUrl":"menu","icon":"el-icon-share","ext":null,"children":[]}]}]},{"pageNum":0,"pageSize":0,"uuid":"2","menuId":"2","menuName":"表格类一级","createdBy":null,"updatedTime":null,"updatedBy":null,"createdTime":null,"remark":null,"version":0,"isDel":0,"pid":"0","isLeaf":false,"fileUrl":null,"icon":"el-icon-share","ext":null,"children":[{"pageNum":0,"pageSize":0,"uuid":"21a","menuId":"21a","menuName":"可拖拽表格","createdBy":null,"updatedTime":null,"updatedBy":null,"createdTime":null,"remark":null,"version":0,"isDel":0,"pid":"2","isLeaf":true,"fileUrl":"treeTable","icon":"el-icon-share","ext":null,"children":[]},{"pageNum":0,"pageSize":0,"uuid":"21b","menuId":"21b","menuName":"用户表格","createdBy":null,"updatedTime":null,"updatedBy":null,"createdTime":null,"remark":null,"version":0,"isDel":0,"pid":"2","isLeaf":true,"fileUrl":"userTable","icon":"el-icon-share","ext":null,"children":[]},{"pageNum":0,"pageSize":0,"uuid":"21c","menuId":"21c","menuName":"静态可拖拽表格","createdBy":null,"updatedTime":null,"updatedBy":null,"createdTime":null,"remark":null,"version":0,"isDel":0,"pid":"2","isLeaf":true,"fileUrl":"table","icon":"el-icon-share","ext":null,"children":[]}]},{"pageNum":0,"pageSize":0,"uuid":"3","menuId":"3","menuName":"表单类一级","createdBy":null,"updatedTime":null,"updatedBy":null,"createdTime":null,"remark":null,"version":0,"isDel":0,"pid":"0","isLeaf":true,"fileUrl":"form","icon":"el-icon-share","ext":null,"children":[]},{"pageNum":0,"pageSize":0,"uuid":"5","menuId":"5","menuName":"其他内容","createdBy":null,"updatedTime":null,"updatedBy":null,"createdTime":null,"remark":null,"version":0,"isDel":0,"pid":"0","isLeaf":false,"fileUrl":null,"icon":"el-icon-share","ext":null,"children":[]},{"pageNum":0,"pageSize":0,"uuid":"6","menuId":"6","menuName":"文件上传","createdBy":null,"updatedTime":null,"updatedBy":null,"createdTime":null,"remark":null,"version":0,"isDel":0,"pid":"0","isLeaf":false,"fileUrl":null,"icon":null,"ext":null,"children":[{"pageNum":0,"pageSize":0,"uuid":"61","menuId":"61","menuName":"excel上传","createdBy":null,"updatedTime":null,"updatedBy":null,"createdTime":null,"remark":null,"version":0,"isDel":0,"pid":"6","isLeaf":true,"fileUrl":"excel","icon":null,"ext":null,"children":[]},{"pageNum":0,"pageSize":0,"uuid":"62","menuId":"62","menuName":"图片上传","createdBy":null,"updatedTime":null,"updatedBy":null,"createdTime":null,"remark":null,"version":0,"isDel":0,"pid":"6","isLeaf":true,"fileUrl":"picture","icon":null,"ext":null,"children":[]}]}]
     * message : null
     * total : null
     */

    private String code;
    private Object message;
    private Object total;
    private List<DataBean> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public Object getTotal() {
        return total;
    }

    public void setTotal(Object total) {
        this.total = total;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        /**
         * pageNum : 0
         * pageSize : 0
         * uuid : 1
         * menuId : 1
         * menuName : 菜单类一级
         * createdBy : null
         * updatedTime : null
         * updatedBy : null
         * createdTime : null
         * remark : null
         * version : 0
         * isDel : 0
         * pid : 0
         * isLeaf : false
         * fileUrl : null
         * icon : el-icon-share
         * ext : null
         * children : [{"pageNum":0,"pageSize":0,"uuid":"11","menuId":"11","menuName":"菜单类二级","createdBy":null,"updatedTime":null,"updatedBy":null,"createdTime":null,"remark":null,"version":0,"isDel":0,"pid":"1","isLeaf":false,"fileUrl":null,"icon":"el-icon-share","ext":null,"children":[{"pageNum":0,"pageSize":0,"uuid":"111","menuId":"111","menuName":"菜单","createdBy":null,"updatedTime":null,"updatedBy":null,"createdTime":null,"remark":null,"version":0,"isDel":0,"pid":"11","isLeaf":true,"fileUrl":"menu","icon":"el-icon-share","ext":null,"children":[]}]}]
         */

        private int pageNum;
        private int pageSize;
        private String uuid;
        private String menuId;
        private String menuName;
        private Object createdBy;
        private Object updatedTime;
        private Object updatedBy;
        private Object createdTime;
        private Object remark;
        private int version;
        private int isDel;
        private String pid;
        private boolean isLeaf;
        private Object fileUrl;
        private String icon;
        private Object ext;
        private List<ChildrenBeanX> children;

        public int getPageNum() {
            return pageNum;
        }

        public void setPageNum(int pageNum) {
            this.pageNum = pageNum;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public String getMenuId() {
            return menuId;
        }

        public void setMenuId(String menuId) {
            this.menuId = menuId;
        }

        public String getMenuName() {
            return menuName;
        }

        public void setMenuName(String menuName) {
            this.menuName = menuName;
        }

        public Object getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(Object createdBy) {
            this.createdBy = createdBy;
        }

        public Object getUpdatedTime() {
            return updatedTime;
        }

        public void setUpdatedTime(Object updatedTime) {
            this.updatedTime = updatedTime;
        }

        public Object getUpdatedBy() {
            return updatedBy;
        }

        public void setUpdatedBy(Object updatedBy) {
            this.updatedBy = updatedBy;
        }

        public Object getCreatedTime() {
            return createdTime;
        }

        public void setCreatedTime(Object createdTime) {
            this.createdTime = createdTime;
        }

        public Object getRemark() {
            return remark;
        }

        public void setRemark(Object remark) {
            this.remark = remark;
        }

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }

        public int getIsDel() {
            return isDel;
        }

        public void setIsDel(int isDel) {
            this.isDel = isDel;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public boolean isIsLeaf() {
            return isLeaf;
        }

        public void setIsLeaf(boolean isLeaf) {
            this.isLeaf = isLeaf;
        }

        public Object getFileUrl() {
            return fileUrl;
        }

        public void setFileUrl(Object fileUrl) {
            this.fileUrl = fileUrl;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public Object getExt() {
            return ext;
        }

        public void setExt(Object ext) {
            this.ext = ext;
        }

        public List<ChildrenBeanX> getChildren() {
            return children;
        }

        public void setChildren(List<ChildrenBeanX> children) {
            this.children = children;
        }

        public static class ChildrenBeanX implements Serializable {
            /**
             * pageNum : 0
             * pageSize : 0
             * uuid : 11
             * menuId : 11
             * menuName : 菜单类二级
             * createdBy : null
             * updatedTime : null
             * updatedBy : null
             * createdTime : null
             * remark : null
             * version : 0
             * isDel : 0
             * pid : 1
             * isLeaf : false
             * fileUrl : null
             * icon : el-icon-share
             * ext : null
             * children : [{"pageNum":0,"pageSize":0,"uuid":"111","menuId":"111","menuName":"菜单","createdBy":null,"updatedTime":null,"updatedBy":null,"createdTime":null,"remark":null,"version":0,"isDel":0,"pid":"11","isLeaf":true,"fileUrl":"menu","icon":"el-icon-share","ext":null,"children":[]}]
             */

            private int pageNum;
            private int pageSize;
            private String uuid;
            private String menuId;
            private String menuName;
            private Object createdBy;
            private Object updatedTime;
            private Object updatedBy;
            private Object createdTime;
            private Object remark;
            private int version;
            private int isDel;
            private String pid;
            private boolean isLeaf;
            private Object fileUrl;
            private String icon;
            private Object ext;
            private List<ChildrenBean> children;

            public int getPageNum() {
                return pageNum;
            }

            public void setPageNum(int pageNum) {
                this.pageNum = pageNum;
            }

            public int getPageSize() {
                return pageSize;
            }

            public void setPageSize(int pageSize) {
                this.pageSize = pageSize;
            }

            public String getUuid() {
                return uuid;
            }

            public void setUuid(String uuid) {
                this.uuid = uuid;
            }

            public String getMenuId() {
                return menuId;
            }

            public void setMenuId(String menuId) {
                this.menuId = menuId;
            }

            public String getMenuName() {
                return menuName;
            }

            public void setMenuName(String menuName) {
                this.menuName = menuName;
            }

            public Object getCreatedBy() {
                return createdBy;
            }

            public void setCreatedBy(Object createdBy) {
                this.createdBy = createdBy;
            }

            public Object getUpdatedTime() {
                return updatedTime;
            }

            public void setUpdatedTime(Object updatedTime) {
                this.updatedTime = updatedTime;
            }

            public Object getUpdatedBy() {
                return updatedBy;
            }

            public void setUpdatedBy(Object updatedBy) {
                this.updatedBy = updatedBy;
            }

            public Object getCreatedTime() {
                return createdTime;
            }

            public void setCreatedTime(Object createdTime) {
                this.createdTime = createdTime;
            }

            public Object getRemark() {
                return remark;
            }

            public void setRemark(Object remark) {
                this.remark = remark;
            }

            public int getVersion() {
                return version;
            }

            public void setVersion(int version) {
                this.version = version;
            }

            public int getIsDel() {
                return isDel;
            }

            public void setIsDel(int isDel) {
                this.isDel = isDel;
            }

            public String getPid() {
                return pid;
            }

            public void setPid(String pid) {
                this.pid = pid;
            }

            public boolean isIsLeaf() {
                return isLeaf;
            }

            public void setIsLeaf(boolean isLeaf) {
                this.isLeaf = isLeaf;
            }

            public Object getFileUrl() {
                return fileUrl;
            }

            public void setFileUrl(Object fileUrl) {
                this.fileUrl = fileUrl;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public Object getExt() {
                return ext;
            }

            public void setExt(Object ext) {
                this.ext = ext;
            }

            public List<ChildrenBean> getChildren() {
                return children;
            }

            public void setChildren(List<ChildrenBean> children) {
                this.children = children;
            }

            public static class ChildrenBean implements Serializable {
                /**
                 * pageNum : 0
                 * pageSize : 0
                 * uuid : 111
                 * menuId : 111
                 * menuName : 菜单
                 * createdBy : null
                 * updatedTime : null
                 * updatedBy : null
                 * createdTime : null
                 * remark : null
                 * version : 0
                 * isDel : 0
                 * pid : 11
                 * isLeaf : true
                 * fileUrl : menu
                 * icon : el-icon-share
                 * ext : null
                 * children : []
                 */

                private int pageNum;
                private int pageSize;
                private String uuid;
                private String menuId;
                private String menuName;
                private Object createdBy;
                private Object updatedTime;
                private Object updatedBy;
                private Object createdTime;
                private Object remark;
                private int version;
                private int isDel;
                private String pid;
                private boolean isLeaf;
                private String fileUrl;
                private String icon;
                private Object ext;
                private List<?> children;

                public int getPageNum() {
                    return pageNum;
                }

                public void setPageNum(int pageNum) {
                    this.pageNum = pageNum;
                }

                public int getPageSize() {
                    return pageSize;
                }

                public void setPageSize(int pageSize) {
                    this.pageSize = pageSize;
                }

                public String getUuid() {
                    return uuid;
                }

                public void setUuid(String uuid) {
                    this.uuid = uuid;
                }

                public String getMenuId() {
                    return menuId;
                }

                public void setMenuId(String menuId) {
                    this.menuId = menuId;
                }

                public String getMenuName() {
                    return menuName;
                }

                public void setMenuName(String menuName) {
                    this.menuName = menuName;
                }

                public Object getCreatedBy() {
                    return createdBy;
                }

                public void setCreatedBy(Object createdBy) {
                    this.createdBy = createdBy;
                }

                public Object getUpdatedTime() {
                    return updatedTime;
                }

                public void setUpdatedTime(Object updatedTime) {
                    this.updatedTime = updatedTime;
                }

                public Object getUpdatedBy() {
                    return updatedBy;
                }

                public void setUpdatedBy(Object updatedBy) {
                    this.updatedBy = updatedBy;
                }

                public Object getCreatedTime() {
                    return createdTime;
                }

                public void setCreatedTime(Object createdTime) {
                    this.createdTime = createdTime;
                }

                public Object getRemark() {
                    return remark;
                }

                public void setRemark(Object remark) {
                    this.remark = remark;
                }

                public int getVersion() {
                    return version;
                }

                public void setVersion(int version) {
                    this.version = version;
                }

                public int getIsDel() {
                    return isDel;
                }

                public void setIsDel(int isDel) {
                    this.isDel = isDel;
                }

                public String getPid() {
                    return pid;
                }

                public void setPid(String pid) {
                    this.pid = pid;
                }

                public boolean isIsLeaf() {
                    return isLeaf;
                }

                public void setIsLeaf(boolean isLeaf) {
                    this.isLeaf = isLeaf;
                }

                public String getFileUrl() {
                    return fileUrl;
                }

                public void setFileUrl(String fileUrl) {
                    this.fileUrl = fileUrl;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public Object getExt() {
                    return ext;
                }

                public void setExt(Object ext) {
                    this.ext = ext;
                }

                public List<?> getChildren() {
                    return children;
                }

                public void setChildren(List<?> children) {
                    this.children = children;
                }

                @Override
                public String toString() {
                    return "ChildrenBean{" +
                            "pageNum=" + pageNum +
                            ", pageSize=" + pageSize +
                            ", uuid='" + uuid + '\'' +
                            ", menuId='" + menuId + '\'' +
                            ", menuName='" + menuName + '\'' +
                            ", createdBy=" + createdBy +
                            ", updatedTime=" + updatedTime +
                            ", updatedBy=" + updatedBy +
                            ", createdTime=" + createdTime +
                            ", remark=" + remark +
                            ", version=" + version +
                            ", isDel=" + isDel +
                            ", pid='" + pid + '\'' +
                            ", isLeaf=" + isLeaf +
                            ", fileUrl='" + fileUrl + '\'' +
                            ", icon='" + icon + '\'' +
                            ", ext=" + ext +
                            ", children=" + children +
                            '}';
                }
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "pageNum=" + pageNum +
                    ", pageSize=" + pageSize +
                    ", uuid='" + uuid + '\'' +
                    ", menuId='" + menuId + '\'' +
                    ", menuName='" + menuName + '\'' +
                    ", createdBy=" + createdBy +
                    ", updatedTime=" + updatedTime +
                    ", updatedBy=" + updatedBy +
                    ", createdTime=" + createdTime +
                    ", remark=" + remark +
                    ", version=" + version +
                    ", isDel=" + isDel +
                    ", pid='" + pid + '\'' +
                    ", isLeaf=" + isLeaf +
                    ", fileUrl=" + fileUrl +
                    ", icon='" + icon + '\'' +
                    ", ext=" + ext +
                    ", children=" + children +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Menu{" +
                "code='" + code + '\'' +
                ", message=" + message +
                ", total=" + total +
                ", data=" + data +
                '}';
    }
}
