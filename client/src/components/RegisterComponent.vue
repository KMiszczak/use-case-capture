<template>
  <div id="outer"> 
    <div id="inner">

    <b-card title="Registration"
    
    style="max-width: 20rem;" 
    class="mb-2">
      <p class="card-text">

        <b-form @submit="onSubmit" >

          <b-form-group id="exampleInputGroup1" label="Username:" label-for="exampleInput1">
            <b-form-input id="exampleInput1" type="username" v-model="form.username" required placeholder="Enter username"></b-form-input>
          </b-form-group>

          <b-form-group id="exampleInputGroup2" label="Firstname:" label-for="exampleInput2">
            <b-form-input id="exampleInput2" type="firstname" v-model="form.firstname" required placeholder="Enter firstname"></b-form-input>
          </b-form-group>

          <b-form-group id="exampleInputGroup3" label="Lastname:" label-for="exampleInput3">
            <b-form-input id="exampleInput3" type="lastname" v-model="form.lastname" required placeholder="Enter lastname"></b-form-input>
          </b-form-group>

          <b-form-group id="exampleInputGroup4" label="Password:" label-for="exampleInput4">
            <b-form-input id="exampleInput4" type="password" v-model="form.password" required placeholder="Enter password"></b-form-input>
          </b-form-group>

          <b-button type="submit" variant="primary">Register</b-button>

          <router-link to="/"> 
            <b-button type="reset" variant="secondary" >Cancel</b-button> 
          </router-link>
          
        </b-form>

      </p>
    </b-card>
  </div>
  </div>
  
</template>

<script>
export default {
  data() {
    return {
      form: {
        username: '',
        firstname: '',
        lastname: '',
        password: ''
      }
    }
  },

  methods: {
    onSubmit(evt) {
      evt.preventDefault();
      alert(JSON.stringify(this.form));
    }
  }
};
</script>

<style scoped>
#inner {
  width: 500px;
  height: 600px;

  position: absolute;
  /*it can be fixed too*/
  left: 0;
  right: 0;
  top: 0;
  bottom: 0;
  margin: auto;

  /*this to solve "the content will not be cut when the window is smaller than the content": */
  max-width: 100%;
  max-height: 100%;
  overflow: auto;
}
</style>