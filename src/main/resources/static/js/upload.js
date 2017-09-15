/**
 * Created by jiang on 2017/9/15.
 */
var vm = new Vue({
    el: '#app',
    data: {
        message: 'Hello Vue!',
        files:[]
    },
    mounted: function () {
        this.$nextTick(function () {
            this.getFiles();
        })
    },
    methods: {
        getFiles: function () {
            var _this = this;
            // ajax的get请求
            /*$.get("/wx/index", function (r) {
                console.log(r);
            })*/
            // 下面是vue-resource插件的使用
            this.$http.get("/wx/index").then(function (res) {
                // console.log(res.data)
                vm.files = res.data;
            },function (res) {
                console.log(res.data)
            })

           /* this.$http.get("/wx/index").then((data() => {
                    this.successCallback();
                },{res} => {

            });*/
        }
    }
})