import * as React from "react";
import * as ReactDOM from "react-dom";
// import { RouteComponentProps } from 'react-router';
import 'isomorphic-fetch';
import * as Immutable from 'immutable';

export type Movie ={
    _id : string,
    actor_id : string,
    title: string
}

export type Message = {

}

export class App extends React.Component<{},{movies:Immutable.List<Movie>}>{

    constructor() {
    		super();
    		this.state = {movies: Immutable.List<Movie>()};
    }

    componentDidMount() {
          this.loadMovies();
    }


    loadMovies = async function(): Promise<void> {
		   let res : Response  = await fetch('./api/movies/', { method: 'get', body: {}, headers: { 'content-type': 'application/json' } });
		   let movieList  = await res.json();
		   this.setState({...this.state ,movies: Immutable.List<Movie>(movieList._embedded.movies)});
    }

    render() :JSX.Element {
          return (
            <div>The list of movies:
                <ul>
                    {this.state.movies.map((m: Movie) => <li key={m.title}>{m.title}</li>
				)}</ul>
            </div>
            );
    }

}

ReactDOM.render(
    <App />,
    document.getElementById("react")
);



/*
class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {movies: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/api/movies'}).done(response => {
			this.setState({movies: response.entity._embedded.movies});
		});
        var res = fetch({method: 'GET', path: '/api/movies'});
        var movieList = res.json();
              console.log(movies);
              this.setState(...this.state,movies: movieList);
	}

	render() {
		return (
			<MovieList movies={this.state.movies}/>
              <div>it works</div>
)
}
}

class MovieList extends React.Component{
	render() {
		var movies = this.props.movies.map(movie =>
			<Movie key={movies._links.self.href} movie={movie}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Description</th>
					</tr>
					{movie}
				</tbody>
			</table>
		)
	}
} */