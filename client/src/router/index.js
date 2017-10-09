import Vue from 'vue'
import Router from 'vue-router'
import LoginComponent from '@/components/LoginComponent'
import UserComponent from '@/components/UserComponent'
import RegisterComponent from '@/components/RegisterComponent'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'LoginComponent',
      component: LoginComponent
    },
    {
      path: '/user',
      name: 'UserComponent',
      component: UserComponent
    },
    {
      path: '/register',
      name: 'RegisterComponent',
      component: RegisterComponent
    }
  ],
  mode: 'history'
})
