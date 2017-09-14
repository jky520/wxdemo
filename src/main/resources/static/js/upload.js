/**
 * Created by jiang on 2017/9/15.
 */
var vm = new Vue({
    el:"#app",
    data: {
        files:[]
    },
    methods: {
        get:function () {
            alert("===============")
            this.$http.get('wx/index').then(function (res) {
                alert(res.data);
            },function (res) {
                console.log(res.status);
            })
        },
    }
})