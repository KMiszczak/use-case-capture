<template>
  <div>
    <!-- Navigationsleiste -->
    <b-navbar toggleable type="light" variant="light">
      <b-nav-toggle target="nav_text_collapse"></b-nav-toggle>
      <b-navbar-brand>Maritime Use Case Capturing</b-navbar-brand>
      <b-collapse is-nav id="nav_text_collapse">
        <b-nav is-nav-bar>
          <b-nav-text>Angemeldet als: {{user.firstName}} {{user.lastName}} </b-nav-text>
        </b-nav>
      </b-collapse>
      <b-nav is-nav-bar>
        <b-nav-item href="#">Abmelden</b-nav-item>
      </b-nav>
    </b-navbar>

    <table>
      <tr>
        <td>
          <!-- Collapse Items -->
          

        <td>
          <div v-for="project in projects">
            <b-btn block v-b-toggle="'collapse' + project.id">Projekt: {{project.name}}</b-btn>
            <b-collapse :id="'collapse' + project.id" accordion='project.id' visible>
              <b-card>
                Projekt Beschreibung
              </b-card>
            </b-collapse>
          </div>
          <b-button href="#">+</b-button>
        </td>

        <td>
          <div v-for="useCase in useCases">
            <b-btn block v-b-toggle="'collapse' + useCase.id + projects.length">Use Case: {{useCase.username}}</b-btn>
            <b-collapse :id="'collapse' + useCase.id + projects.length" accordion='useCase.id + projects.length' visible>
              <b-card>

                Titel: {{useCase.username}} <br>
                Version: 1 <br>
                Status: aktiv <br>

                <b-container fluid>
                  <b-row class="my-1" v-for="type in types" :key="type">
                    <b-col sm="3">
                      <label :for="`type-${type}`">{{ type }}:</label>
                    </b-col>
                    <b-col sm="9">
                      <b-form-input :id="`type-${type}`" :type="type"></b-form-input>
                    </b-col>
                  </b-row>
                </b-container>


              </b-card>
            </b-collapse>
          </div>
          <b-button href="#">+</b-button>
        </td>

      </tr>
    </table>
  </div>
</template>

<script>
export default {
  name: 'hello',
  data() {
    return {
      projects: [],
      useCases:[],
      title: 'Hello World',
      user: {
        firstName: 'Kevin',
        lastName: 'Miszczak'
      },
      types: [
        'Titel', 'Version', 'Status'
      ],
      text: 'In einem Use Case – auch Anwendungsfall genannt – wird das nach außen sichtbare Verhalten eines Systems aus Sicht der Nutzer beschrieben. Ein Nutzer kann hierbei eine Person, eine Rolle oder ein anderes System sein. Dieser Nutzer tritt als Akteur mit dem System in Interaktion, um ein bestimmtes Ziel zu erreichen.'
    }
  },
  created: function() {
    this.$http.get('https://jsonplaceholder.typicode.com/users')
      .then(function(response) {
        this.projects = response.data;
        this.useCases = response.data;
      });
  }

}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
