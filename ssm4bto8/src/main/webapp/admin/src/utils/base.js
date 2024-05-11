const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm4bto8/",
            name: "ssm4bto8",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm4bto8/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校学生事务管理系统"
        } 
    }
}
export default base
